import java.io.*;
import java.net.*;
import java.util.*;

public class ServerStr {
  ServerSocket server = null;
  Socket client = null;
  String stringaRicevuta = null;
  String stringaModificata = null;
  BufferedReader inDalClient;
  DataOutputStream outVersoClient;

  public Socket attendi() {
    try {
      System.out.println("1 SERVER partito in esecuzione ...");
      server = new ServerSocket(6789);
      client = server.accept();
      server.close();
      inDalClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
      outVersoClient = new DataOutputStream(client.getOutputStream());
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("Errore durante la connessione");
      System.exit(1);
    }
    return client;
  }

  public void comunica() {
    try {
      System.out.println("3 Benvenuto client, scrivi una frase e la trasformo in maiuscolo. Attendo ...");
      stringaRicevuta = inDalClient.readLine();

      System.out.println("6 rivevuta la stringa dal client: " + stringaRicevuta);
      stringaModificata = stringaRicevuta.toUpperCase();
      outVersoClient.writeBytes(stringaModificata + "\n");
      System.out.println("9 SERVER: fine elaborazione ... buona notte!");
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
