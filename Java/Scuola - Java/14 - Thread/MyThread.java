// Classe che estende la classe thread
public class MyThread extends Thread {
  // Metodo per l'esecuzione del thread con override
  @Override
  public void run() {
    // Variabile di controllo
    int a;
    // Ciclo for
    for (a = 0; a < 10; a++) {
      System.out.printf("Il thread processa la variabile a: %d\n", a);
    }
  }

}