public class App {
    public static void main(String[] args) throws Exception {
        // Istanziamento di oggetti della classe EsempioMultithread
        EsempioMultithread processo1 = new EsempioMultithread(1);
        EsempioMultithread processo2 = new EsempioMultithread(2);
        // Implementazione dell'interfaccia
        Thread nuovoProcesso1 = new Thread(processo1);
        Thread nuovoProcesso2 = new Thread(processo2);
        // Esecuzione di due processi contemporaneamente
        nuovoProcesso1.start();
        nuovoProcesso2.start();
    }
}
