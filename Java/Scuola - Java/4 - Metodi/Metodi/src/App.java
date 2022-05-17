public class App {
    public static void main(String[] args) throws Exception {
        // Variabile per il controllo della partita
        boolean partitaPersa = true;
        // Variabile per il numero di livelli e bonus
        int livelliCompletati = 4;
        int bonus = 200;
        // Variabile che contiene un punteggio
        int punteggio = 800;
        // Costrutto if per il controllo di alcune condizioni
        if (punteggio < 5000 && punteggio > 1000) {
            System.out.println("Risultato buono, maggiore di 1000.");
        } else if (punteggio < 1000) {
            System.out.println("Peccato, meno di 1000.");
        } else {
            System.out.println("Ottimo.");
        }
        // Invocazione della funzione con i parametri richiesti
        calcolaPunteggio(partitaPersa, punteggio, livelliCompletati, bonus);
        // Funzione con parametri diversi
        calcolaPunteggio(partitaPersa, 2000, 5, 500);
        // Funzione con return int
        System.out.println(calcolaPunteggioInt(false, 10, 1, 4));
    }

    // I metodi sono nella classe ma fuori dal metodo main

    // Metodo void (senza return) per calcolare il punteggio finale
    public static void calcolaPunteggio(boolean partitaPersa, int punteggio, int livelliCompletati, int bonus) {
        // Costrutto if per il controllo della partita
        if (partitaPersa) {
            // Variabile per punteggio finale
            int punteggioFinale = punteggio + (livelliCompletati * bonus);
            punteggioFinale += 1000;
            // Output punteggio
            System.out.printf("Punteggio finale: %d punti.\n", punteggioFinale);
        }
    }

    // Metodo con return int
    public static int calcolaPunteggioInt(boolean partitaPersa, int punteggio, int livelliCompletati, int bonus) {
        if (partitaPersa) {
            // Variabile per punteggio finale
            int punteggioFinale = punteggio + (livelliCompletati * bonus);
            punteggioFinale += 1000;
            // Return del punteggio finale
            return punteggioFinale;
        }
        // Return se la condizione è falsa
        return -1;
    }
}
