import java.io.*;
import java.net.*;

public class Client2 {
  String nomeServer = "nomeServer"; // Indirizzo del server
  int portaServer = 6789; // Porta del servizio
  DataInputStream in; // Stream di input
  DataOutputStream out; // Stream di output

  protected Socket connetti() throws IOException {
    Socket socket = new Socket(nomeServer, portaServer);
    out = new DataOutputStream(socket.getOutputStream());
    in = new DataInputStream(socket.getInputStream());
    return socket;
  }
}
