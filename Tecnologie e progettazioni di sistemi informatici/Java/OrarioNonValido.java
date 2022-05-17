public class OrarioNonValido extends Exception {
  private int h;
  private int m;
  private int s;

  public OrarioNonValido(int h, int m, int s) {
    this.h = h;
    this.m = m;
    this.s = s;
  }

  public int getOre() {
    return h;
  }

  public int getMinuti() {
    return m;
  }

  public int getSecondi() {
    return s;
  }

  public String toString() {
    return ("" + h + ":" + m + ":" + s);
  }
}