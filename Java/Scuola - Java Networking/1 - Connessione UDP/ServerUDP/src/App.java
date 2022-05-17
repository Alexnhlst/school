import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            // DatagramSocket, classe essenziale per la costruzione di un socket
            DatagramSocket socket = new DatagramSocket(5000);
            while (true) {
                // Array per creare una porzione di memoria di 50 byte
                byte[] buffer = new byte[50];
                // Creazione del pacchetto datagram nel buffer con la sua lunghezza
                DatagramPacket pacchetto = new DatagramPacket(buffer, buffer.length);
                // Metodo per la ricezione del pacchetto
                socket.receive(pacchetto);
                // Output del dato ricevuto
                System.out.printf("Dato ricevuto: %s", new String(buffer, 0, pacchetto.getLength()));
            }
            // Gestione errorri del socket
        } catch (SocketException e) {
            System.out.printf("\nEccezione del socket %s", e.getMessage());
            // Gestione errori input/output
        } catch (IOException e) {
            System.out.printf("\nMessaggi: %s", e.getMessage());
        }
    }
}
