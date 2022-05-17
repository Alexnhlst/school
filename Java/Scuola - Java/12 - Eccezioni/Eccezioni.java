public class Eccezioni {
  public static void main(String[] args) {
    // Istanziamento di un oggetto da GestioneEccezione
    GestioneEccezione risultato = new GestioneEccezione();
    /*
     * Invocazione metodo che prova un'eccezione
     * System.out.println(risultato.operazione(5, 0));
     * Invocazione metodo che verrà bloccato dall'eccezione
     * System.out.println(risultato.addizione(5, 3));
     */
    // Blocco Try/Catch per gestire le eccezioni
    try {
      int divisione = risultato.operazione(5, 0);
    } catch (Exception e) {
      // Messaggio di default
      System.out.println(e);
      // Messaggio più comprensibile dall'utente
      System.out.println("Impossibile dividere per 0");
    }
    // Il programma non viene bloccato
    System.out.println(risultato.addizione(5, 3));
  }
}