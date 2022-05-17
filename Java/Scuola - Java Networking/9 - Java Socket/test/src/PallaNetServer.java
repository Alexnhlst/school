import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class PallaNetServer extends JFrame {
  private Socket connessione = null;
  private DataOutputStream out = null;
  private DataInputStream input = null;

  public PallaNetServer() {
    super("PallaNet - Server");
    this.setSize(500, 400);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ThreadConnessione attendiConnessione = new ThreadConnessione(this);
    this.setVisible(true);
  }

  public void setConnessione(Socket connessione) {
    this.connessione = connessione;
    try {
      out = new DataOutputStream(connessione.getOutputStream());
      input = new DataInputStream(connessione.getInputStream());
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.toString());
      System.exit(-1);
    }
    PannelloServer pan = new PannelloServer(this, this.getSize());
    this.add(pan);
  }

  public DataInputStream getInput() {
    return input;
  }

  public DataOutputStream getOutput() {
    return out;
  }

}

class ThreadConnessione implements Runnable {
  private PallaNetServer finestra;
  private Thread me;

  public ThreadConnessione(PallaNetServer finestra) {
    this.finestra = finestra;
    me = new Thread(this);
    me.start();
  }

  public void run() {
    try {
      ServerSocket server = new ServerSocket(6789);
      finestra.setConnessione(server.accept());
      server.close();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.toString());
      System.exit(-1);
    }
  }

}

class PannelloServer extends JPanel implements ActionListener {
  private PallaNetServer finestra;
  private Dimension dimensioni;
  private Image bufferVirtuale;
  private Graphics offScreen;
  private Timer tim = null;
  private int xPallina = 0;
  private int yPallina = 0;
  private int diametroPallina = 40;
  private int spostament = 3;
  private int timerDelay = 10;
  private boolean destra, basso, pallinaPresente, arrivoComunicato;

  public PannelloServer(PallaNetServer finestra, Dimension dimensioni) {
    super();
    this.finestra = finestra;
    this.setSize(dimensioni);
    destra = true;
    basso = true;
    pallinaPresente = true;
    arrivoComunicato = false;
    tim = new Timer(timerDelay, this);
    tim.start();
  }

  public void update(Graphics g) {
    paint(g);
  }

  public void paint(Graphics g) {
    super.paint(g);
    bufferVirtuale = createImage(getWidth(), getHeight());
    offScreen = bufferVirtuale.getGraphics();
    Graphics2D screen = (Graphics2D) g;
    offScreen.setColor(new Color(254, 138, 22));
    if (pallinaPresente) {
      offScreen.fillOval(xPallina, yPallina, diametroPallina, diametroPallina);
    }
    screen.drawImage(bufferVirtuale, 0, 0, this);
    offScreen.dispose();
  }

  public void actionPerformed(ActionEvent e) {
    if (pallinaPresente) {
      if (basso) {
        if (yPallina > (this.getHeight() - diametroPallina)) {
          basso = false;
          yPallina -= spostament;
        } else {
          yPallina += spostament;
        }
      } else {
        if (yPallina <= 0) {
          basso = true;
          yPallina += spostament;
        } else {
          yPallina -= spostament;
        }
      }
      if (destra) {
        if ((!arrivoComunicato) && (xPallina > (this.getWidth() - diametroPallina))) {
          try {
            finestra.getOutput().writeBoolean(basso);
            finestra.getOutput().writeInt(yPallina);
            arrivoComunicato = true;
          } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, exc.toString());
            System.exit(-1);
          }
        } else {
          xPallina += spostament;
          if (xPallina > this.getWidth()) {
            pallinaPresente = false;
            arrivoComunicato = false;
          }
        }
      } else {
        if (xPallina <= 0) {
          destra = true;
          xPallina += spostament;
        } else {
          xPallina -= spostament;
        }
      }
    } else {
      boolean direzione = false;
      int y = 0;
      try {
        direzione = finestra.getInput().readBoolean();
        y = finestra.getInput().readInt();
        basso = direzione;
        destra = false;
        yPallina = y;
        xPallina = this.getWidth();
        pallinaPresente = true;
      } catch (Exception exc) {
        JOptionPane.showMessageDialog(null, exc.toString());
        System.exit(-1);
      }
    }
    repaint();
  }
}