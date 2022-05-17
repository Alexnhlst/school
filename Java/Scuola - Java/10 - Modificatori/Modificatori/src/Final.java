public class Final {
  private static int contatore = 0;
  // proprietà final, saranno costanti
  public final int numero;
  public final String nome;

  // Costruttore
  public Final(String nome) {
    this.nome = nome;
    // Incremento contatore
    contatore++;
    numero = contatore;
    // Output
    System.out.printf("%s, valore: %d\n", nome, numero);
  }

  // Getter
  public int getNumero() {
    return numero;
  }

  /*
   * Il setter non funziona in quanto impossibile riassegnare la variabile public
   * void setNumero(int numero) { 
   * this.numero = numero; 
   * }
   */
}
