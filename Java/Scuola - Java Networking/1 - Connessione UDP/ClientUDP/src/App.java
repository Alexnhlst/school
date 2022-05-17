import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            // Creazione dell'indirizzo di rete. getLocalHost agisce in locale. in alternativa getByName(indirizzo)
            InetAddress indirizzoServer = InetAddress.getLocalHost();
            DatagramSocket datagramSocket = new DatagramSocket();
            Scanner scanner = new Scanner(System.in);
            String echoString;
            do {
                System.out.println("Il client ci trasmette: ");
                echoString = scanner.nextLine();
                byte[] buffer = echoString.getBytes();
                // Il pacchetto contiene l'informazione di input, l'indirizzo e la porta
                DatagramPacket pacchetto = new DatagramPacket(buffer, buffer.length, indirizzoServer, 5000);
                // Invio del datagram
                datagramSocket.send(pacchetto);
                // Se l'input è exit, termina la connessione
            } while (!echoString.equals("exit"));
            // Gestione timeout del server (inattività)
        } catch (SocketTimeoutException e) {
            System.out.println("Timeout del socket");
        } catch (IOException e) {
            System.out.printf("Errore del client: %s", e.getMessage());
        }
    }
}
