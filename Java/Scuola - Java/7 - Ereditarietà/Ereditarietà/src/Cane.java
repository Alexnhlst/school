// Sottoclasse (Child class)
public class Cane extends Animale {
  // Costruttore con super per richiamare la superclasse
  public Cane(int occhi, int zampe, String mantello, String nome, int misura, int peso) {
    super(nome, misura, peso);
    this.occhi = occhi;
    this.zampe = zampe;
    this.mantello = mantello;
  }

  // Attributi propri
  private int occhi;
  private int zampe;
  private String mantello;

  // Metodi propri
  public void masticaOsso() {
    System.out.printf("Il cane %s mastica l'osso\n", this.nome);
  }

  // Richiamo metodi della superclasse modificandoli con override
  @Override
  public void mangiare() {
    System.out.printf("Il cane %s mangia\n", this.nome);
    // Richiamo metodo originale
    super.mangiare();
  }

  @Override
  public void muovere() {
    System.out.printf("Il cane %s si muove\n", this.nome);
    // Richiamo metodo originale
    super.muovere();
  }
}
