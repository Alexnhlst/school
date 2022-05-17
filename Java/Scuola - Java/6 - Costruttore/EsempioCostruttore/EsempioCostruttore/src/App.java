public class App {
    public static void main(String[] args) throws Exception {
        // Istanza dell'oggetto
        Operazioni risultato = new Operazioni(10, 2);
        // Assegnazione del metodo dell'oggetto
        int addizione = risultato.eseguoAddizione();
        int sottrazione = risultato.eseguoSottrazione();
        // Output del metodo
        System.out.println(addizione);
        System.out.println(sottrazione);
    }
}
