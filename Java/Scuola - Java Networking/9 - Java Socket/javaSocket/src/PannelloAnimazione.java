import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

class PannelloAnimazione extends JPanel implements ActionListener {
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

  public PannelloAnimazione(PallaNetServer finestra, Dimension dimensioni) {
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