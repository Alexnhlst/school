// Classe che implementa l'interfaccia runnable
public class MyRunnable implements Runnable {
  // Metodo per l'esecuzione del thread con override
  @Override
  public void run() {
    // Variabile di controllo
    int b;
    // Ciclo for
    for (b = 5; b < 10; b++) {
      System.out.printf("Il thread processa la variabile b: %d\n", b);
    }
  }
}
