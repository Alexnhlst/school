public class EsempioThread {
  public static void main(String[] args) {
    // Istanziamento di un oggetto della classe MyyThread
    MyThread esempioThread = new MyThread();
    System.out.println("Esecuzione del thread, usando la classe Thread");
    // Esecuzione thread
    esempioThread.start();

    // Istanziamento di un oggetto della classe MyRunnable
    MyRunnable esempioRunnable = new MyRunnable();
    // Implementazione dell'interfaccia grazie alla classe thread
    Thread nuovoProcesso = new Thread(esempioRunnable);
    System.out.println("Esecuzione del thread, usando l'interfaccia Runnable");
    nuovoProcesso.start();
  }
}