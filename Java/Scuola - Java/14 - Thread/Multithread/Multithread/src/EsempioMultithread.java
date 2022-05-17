public class EsempioMultithread implements Runnable {
  // variabile privata
  private int processo;

  // Costruttore
  public EsempioMultithread(int a) {
    setProcesso(a);
  }

  // Getter
  public int getProcesso() {
    return processo;
  }

  // Setter
  public void setProcesso(int a) {
    processo = a;
  }

  // Metodo per l'esecuzione
  @Override
  public void run() {
    // Variabile di controllo
    int a;
    // Ciclo for
    for (a = 0; a <= 5; a++) {
      System.out.printf("In esecuzione il processo %d, valore di a: %d\n", getProcesso(), a);
      // Try/Catch per catturare possibili eccezioni di più processi contemporanei
      try {
        // Metodo sleep per dare un tempo di latenza ai processi
        Thread.sleep(3000);
      } catch (Exception e) {
        System.out.println("Attenzione");
      }
    }
  }
}
