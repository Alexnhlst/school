public class GestioneEccezione {
  // Metodo che potrebbe provocare un'eccezione
  public int operazione(int a, int b) {
    return a / b;
  }

  // Metodo che non viene eseguito se il parsing è bloccatto dall'eccezione
  public int addizione(int a, int b) {
    return a + b;
  }
}