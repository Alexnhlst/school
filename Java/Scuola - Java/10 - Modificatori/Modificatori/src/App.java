public class App {
    public static void main(String[] args) throws Exception {
        // Istanziamento di oggeti da Static
        Static numero1 = new Static();
        Static numero2 = new Static();
        Static numero3 = new Static();
        // Assegnazione di un valore, l'ultimo valore sarà assegnato a tutte le istanze
        numero1.numero = 5;
        numero2.numero = 10;
        numero3.numero = 15;
        // Output con getter
        System.out.printf("Istanza 1: %d\n", numero1.numero);
        System.out.printf("Istanza 2: %d\n", numero2.numero);
        System.out.printf("Istanza 3: %d\n", numero3.numero);
        System.out.println("==============================");
        // Istanziamento di oggetti da Final
        Final uno = new Final("Numero 1");
        Final due = new Final("Numero 2");
        Final tre = new Final("Numero 3");
        /*
         * Errore durante la riassegnazione di un valore final 
         * uno.setNumero(3);
         */
        System.out.println("==============================");
        // Istanziamento di Rettangolo, che eredita da Abstract
        Abstract rettangolo = new Rettangolo(5, 2);
        // Invocazione dei metodi
        rettangolo.disegna();
        rettangolo.perimetro();
    }
}
