public class App {
    public static void main(String[] args) throws Exception {
        // Istanziamento di un oggetto da Cliente
        Cliente cliente1 = new Cliente();
        /*
         * la proprietà non è accessibile in quanto private cliente1.nome = "Mario";
         */
        // Utilizzo del metodo public per modificare il nome
        cliente1.setNome("Mario");
        // Output del nome con metodo publico
        System.out.println(cliente1.getNome());
        // Utilizzo del metodo public per modificare l'anno di nascita
        cliente1.setAnnoNascita(1980);
        // Utilizzo del metodo per il controllo delle proprietà
        System.out.println(cliente1.validaIngresso("Mario", 2015));
    }
}
