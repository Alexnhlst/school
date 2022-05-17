
// Importazione librerie necessarie
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Oggetto instanziato da Socket con localhost su porta 5000
        try (Socket socket = new Socket("localhost", 5000)) {
            // BufferedReader e PrintWriter hanno lo stesso funzionamento del lato server
            BufferedReader repliche = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String echoString;
            String risposta;
            do {
                System.out.println("Inserisci un testo per la replica del server: ");
                echoString = scanner.nextLine();
                stringToEcho.println(echoString);
                if (!echoString.equals("client disconesso")) {
                    risposta = repliche.readLine();
                    System.out.println(risposta);
                }
            } while (!echoString.equals("client disconesso"));
        } catch (IOException e) {
            System.out.println("Errori del client: " + e.getMessage());
        }
    }
}
