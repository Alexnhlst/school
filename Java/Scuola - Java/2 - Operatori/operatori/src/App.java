public class App {
    public static void main(String[] args) throws Exception {
        // Somma
        int risultato = 3 + 6;
        // Riassegnazione di una variabile con una sottrazione
        risultato = risultato - 1;
        // Incremento di uno di una variabile
        risultato++;
        // Riassegnazione di una variabile con un'addizione
        risultato += 2;
        // Assegnazione di una variabile già definitia ad una nuova variabile
        int nuovoRisultato = risultato;
        // Creazione di variabile per i controlli
        int punteggio = 20;
        int vite = 4;
        System.out.printf("Primo passaggio = %d", risultato);
        // Moltiplicazione
        System.out.printf("\nSecondo passaggio = %d", nuovoRisultato * 2);
        // Moltiplicazione e sottrazione
        System.out.printf("\nTerzo passaggio = %d", (nuovoRisultato * 3 - risultato));
        System.out.printf("\nQuarto passaggio = %d", nuovoRisultato);
        System.out.printf("\nQuinto passaggio = %d", nuovoRisultato);
        // Controllo se una variabile è minore di un valore
        if (punteggio < 20) {
            System.out.println("\nHai perso.");
        } else if (punteggio == 20) {
            System.out.println("\nHai quasi vinto");
        } else {
            System.out.println("\nHai vinto.");
        }
        // Controllo più accurato con and, or, not
        if (punteggio < 20 && vite < 4) {
            System.out.println("Game over");
        } else if (punteggio > 20 || vite == 4) {
            System.out.println("Ottimo risultato");
        } else if (punteggio > 20 && vite > 4) {
            System.out.println("Livello bonus.");
        }

        int x = 5;
        boolean b = !(x < 6 && x < 3);
        System.out.println(b);
        boolean c = b && x > 8;
        System.out.println(c);
        boolean d = !c;
        System.out.println(d);
    }

}
