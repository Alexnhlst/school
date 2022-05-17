
// Importazione delle librerie richieste
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// Classe che estende la classe thread per gestire più processi
public class Replicatore extends Thread {
  // Variabile che contiene un oggetto socket
  private Socket socket;

  // Costruttore
  public Replicatore(Socket socket) {
    this.socket = socket;
  }

  // Metodo override che sostituisce run
  @Override
  public void run() {
    try {
      // BufferedReader rende possibile la lettura del pacchetto di byte inviato dal
      // client
      BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      // PrintWriter trasforma i pacchetti in stringhe
      PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
      // Ciclo while che controlla che l'input sia vero
      while (true) {
        // legge l'input dato dal client
        String echoString = input.readLine();
        // Output del messaggio comunicato
        System.out.printf("Input del client: %s\n", echoString);
        // Se l'input è uguale ad exit interrompe la connessione
        if (echoString.equals("exit")) {
          break;
        }
        output.println(echoString);
      }
    } catch (IOException e) {
      System.out.println("Qualcosa non va: " + e.getMessage());
    } finally {
      try {
        socket.close();
      } catch (IOException e) {
      }
    }
  }

}
