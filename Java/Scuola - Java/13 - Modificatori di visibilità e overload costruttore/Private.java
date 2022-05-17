public class Private {
  // Proprietà private
  private int anni;
  private String nome;

  // metodo per accedere alle proprietà in modo tale da leggerle, ma non modificarle
  public void informazioni() {
    anni = 30;
    nome = "Mario";
    System.out.printf("Nome: %s - Anni: %d\n", nome, anni);
  }

  // Metodo private
  private void iscrizione() {
    System.out.printf("Iscrizione effettuata.\n");
  }

  // Metodo per accedere al metodo private
  public void permettiIscrizione() {
    iscrizione();
  }
}