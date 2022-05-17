public class Protected {
  // Proprietà e metodo protected
  protected String razzaGatto;
  protected String coloreOcchi;
  protected String mantello;

  // Overload costruttore
  public Protected() {
  }

  // Costruttore
  public Protected(String razzaGatto, String coloreOcchi) {
    this.razzaGatto = razzaGatto;
    this.coloreOcchi = coloreOcchi;
  }

  protected void miagola(String nomeGatto) {
    System.out.printf("Il gatto %s miagola.", nomeGatto);
  }
}