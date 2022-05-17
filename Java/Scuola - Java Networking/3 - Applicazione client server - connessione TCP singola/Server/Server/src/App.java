
// Importazione delle librerie necessarie
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class App {
    public static void main(String[] args) throws Exception {
        // Oggetto istanziato dalla classe ServerSocket con porta di ascolto 5000
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            // .accept() - metodo che indica il server che autorizza l'ingresso dell client
            Socket socket = serverSocket.accept();
            // Output che comunica la connessione con il client
            System.out.println("Client connesso");
            // BufferedReader rende possibile la lettura del pacchetto di byte inviato dal
            // client
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // PrintWriter trasforma i pacchetti in stringhe
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            // ciclo while per controllare la connessione
            while (true) {
                // legge l'input dato dal client, impostato grazie alle classi definite prima
                String echoString = input.readLine();
                if (echoString.equals("client disconnesso")) {
                    break;
                }
                // Altrimenti output del messaggio comunicato
                output.println("Replica del server: " + echoString);
            }
        } catch (IOException e) {
            System.out.println("Eccezione del Server: " + e.getMessage());
        }
    }
}
