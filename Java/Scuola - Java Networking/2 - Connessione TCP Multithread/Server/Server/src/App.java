
// Importazione delle librerie necessarie
import java.io.IOException;
import java.net.ServerSocket;

public class App {
    public static void main(String[] args) throws Exception {
        // Oggetto istanziato dalla classe ServerSocket con porta di ascolto 5000
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            // ciclo while per controllare le connessioni
            while (true) {
                // Connessione al socket grazie alla classe replicatore
                new Replicatore(serverSocket.accept()).start();
                // Il codice sopra è illustrato in questi passaggi
                // Oggetto socket istanziato dalla classe socket
                // Socket socket = serverSocket.accept();
                // Oggetto replica istanziato dalla classe Replicatore
                // Replicatore replica = new Replicatore(socket);
                // Avvio
                // replica.start();
            }
        } catch (IOException e) {
            System.out.println("Eccezione del Server: " + e.getMessage());
        }
    }
}
