public class App {
    public static void main(String[] args) throws Exception {
        // Istanzio due oggetti della classe Pet
        Pet gatto = new Pet();
        Pet cane = new Pet();
        // Assegno una proprietà agli oggetti
        gatto.nome = "Kaworu";
        cane.nome = "Shinji";
        // Outuput di una proprietà
        System.out.println(gatto.nome);
        // Invocazione del metodo
        cane.abbaia();
    }
}

// Creo una classe
class Pet {
    // Proprietà della classe con modificatori di accesso
    public String nome;
    private String razza;
    private int anni;

    // creo un metodo
    public void abbaia() {
        System.out.printf("Il cane %s abbaia", this.nome);
    }
}