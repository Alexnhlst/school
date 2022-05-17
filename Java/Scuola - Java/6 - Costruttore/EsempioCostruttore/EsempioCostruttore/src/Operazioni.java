public class Operazioni {
  // Variabili per contenere i numeri
  public int numero1;
  public int numero2;

  // Metodo costruttore, ha lo stesso nome della classe
  public Operazioni(int a, int b) {
    // Assegnazione degli attributi alle variabili
    this.numero1 = a;
    this.numero2 = b;
  }

  // Metodo per la somma
  public int eseguoAddizione() {
    // Variabile per il risultato
    int addizione;
    addizione = numero1 + numero2;
    return addizione;
  }

  // Metodo per la sottrazione
  public int eseguoSottrazione() {
    // Variabile per il risultato
    int sottrazione;
    sottrazione = numero1 - numero2;
    return sottrazione;
  }
}
