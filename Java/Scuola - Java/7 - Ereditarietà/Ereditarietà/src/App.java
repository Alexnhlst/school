public class App {
    public static void main(String[] args) throws Exception {
        // Istanzio un oggetto da Animale
        Animale mammifero = new Animale("Criceto", 5, 3);
        // Istanzio un oggetto da Cane
        Cane labrador = new Cane(2, 4, "miele", "Fido", 10, 15);
        // Richiamo metodi di labrador
        labrador.mangiare();
        labrador.muovere();
        labrador.masticaOsso();
        // Richiamo metodi di mammifero
        System.out.println(mammifero.getNome());
        // Metodo comune ad entrambi gli oggetti
        System.out.println(labrador.getNome());
    }
}
