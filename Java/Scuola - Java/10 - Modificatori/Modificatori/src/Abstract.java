// Classe astratta, non ancora definita
public abstract class Abstract {
  public int x;
  public int y;

  // Costruttore
  public Abstract(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Metodi astratti, non ancora definite
  abstract void disegna();

  abstract void perimetro();
}

// Classe che eredita in quanto Abstract non è istanziabile
class Rettangolo extends Abstract {
  // Costruttore
  public Rettangolo(int x, int y) {
    super(x, y);
  }

  // Definizione dei metodi astratti con override
  @Override
  void disegna() {
    System.out.printf("Lunghezza: %d, altezza: %d\n", x, y);
  }

  @Override
  void perimetro() {
    int perimetro = (x + y) * 2;
    System.out.printf("Perimetro: %d cm\n", perimetro);
  }
}