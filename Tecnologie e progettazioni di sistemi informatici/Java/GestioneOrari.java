
public class GestioneOrari {

  /*
   * Verifica la validità di un orario espresso nel formato
   * h:m:s (ore, minuti e secondi)
   */
  private static boolean orarioValido(int h, int m, int s) {
    if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * Calcola la differenza in secondi tra due orari espressi nel formato
   * h:m:s (ore, minuti e secondi)
   */
  public static int differenzaOrari(int h1, int m1, int s1, int h2, int m2, int s2)
      throws OrarioNonValido {
    if (!orarioValido(h1, m1, s1)) {
      throw new OrarioNonValido(h1, m1, s1);
    } else if (!orarioValido(h2, m2, s2)) {
      throw new OrarioNonValido(h2, m2, s2);
    } else {
      int sec1, sec2;
      sec1 = h1 * 3600 + m1 * 60 + s1;
      sec2 = h1 * 3600 + m1 * 60 + s2;
      return (sec2 - sec1);
    }
  }

  public static void main(String[] args) {
    try {
      int ss = GestioneOrari.differenzaOrari(0, 0, 0, 23, 59, 59);
      System.out.println("Secondi di differenza " + ss);

    } catch (OrarioNonValido exception) {
      System.out.println("Errore nell'orario specificato (" + exception.getOre() + ":" +
          exception.getMinuti() + ":" + exception.getSecondi() + ")!");
    }
    try {
      int ss = GestioneOrari.differenzaOrari(0, 0, 0, 24, 0, 0);
      System.out.println("Secondi di differenza " + ss);
    } catch (OrarioNonValido exception) {
      System.out.println("Errore nell'orario specificato (" + exception.getOre() + ":" +
          exception.getMinuti() + ":" + exception.getSecondi() + ")!");
    }
  }
}
