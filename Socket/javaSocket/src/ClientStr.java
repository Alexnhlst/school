import java.io.*;
import java.net.*;

public class ClientStr {
  String nomeServer = "localhost";
  int portaServer = 6789;
  Socket mioSocket;
  BufferedReader tastiera;
  String stringaUtente;
  String stringaRicevutaDalServer;
  DataOutputStream outVersoServer;
  BufferedReader inDalServer;

  public Socket connetti() {
    System.out.println("2 CLIENT partito in esecuzione...");
    try {
      mioSocket = new Socket(InetAddress.getLocalHost(), portaServer);
      tastiera = new BufferedReader(new InputStreamReader(System.in));
      // mioSocket = new Socket(nomeServer, portaServer);
      outVersoServer = new DataOutputStream(mioSocket.getOutputStream());
      inDalServer = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()));
    } catch (UnknownHostException e) {
      System.out.println("Host sconosciuto");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("Errore durante la connessione");
      System.exit(1);
    }
    return mioSocket;
  }

  public void comunica() {
    try {
      System.out.println("4 ... inserisci la stringa da trasmettere al server\n");
      stringaUtente = tastiera.readLine();
      System.out.println("5 ... invio la stringa al server e attendo");
      outVersoServer.writeBytes(stringaUtente + "\n");
      stringaRicevutaDalServer = inDalServer.readLine();
      System.out.println("8 ... risosta dal server \n" + stringaRicevutaDalServer);
      System.out.println("9 ... CLIENT: termina eleaborazione chiude connessione");
      mioSocket.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("Errore durante la connessione");
      System.exit(1);
    }
  }
}
