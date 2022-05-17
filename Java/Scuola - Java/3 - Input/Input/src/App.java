
// Importazionde della libreria scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Direttiva di input con la classe Scanner
        Scanner scanner = new Scanner(System.in);
        // StringBuilder per rendere mutevole un oggetto string
        StringBuilder stringa = new StringBuilder();
        // Direttiva di output
        System.out.print("Inserisci un valore: ");
        // Variabele che contiene il valore inserito
        String input1 = scanner.nextLine();
        // Controllo valore in input
        System.out.printf("Valore inserito: %s", input1);
        // Seconda variabile
        System.out.print("\nInserisci un altro valore: ");
        String input2 = scanner.nextLine();
        // Concatenazione all'oggetto string dei due valori in input
        stringa.append(input1).append(", ").append(input2);
        System.out.printf("Valori inseriti: %s\n", stringa);
        // Gli input inseriti sono string
        System.out.printf("Valori di tipo string: %s\n", input1 + input2);
        // Variabili che parserizzano l'input in tipo double
        double numero1 = Double.parseDouble(input1);
        double numero2 = Double.parseDouble(input2);
        // Somma degli input parserizzati
        System.out.printf("Valori di tipo double: %f", numero1 + numero2);
        // Chiusura dell'oggetto scanner
        scanner.close();
    }
}
