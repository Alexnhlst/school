public class PuntoOrientato extends Punto {
  private char orientamento;

  // Costruttori
  public PuntoOrientato() {
    super(0., 0.);
    this.orientamento = 'A';
  }

  public PuntoOrientato(double x, double y, char orientamento) throws Exception {
    super(x, y);
    setOrientamento(orientamento);
  }

  public PuntoOrientato(PuntoOrientato po) throws Exception {
    super(po.getX(), po.getY());
    setOrientamento(po.getOrientamento());
  }

  // setter/getter
  public void setOrientamento(char orientamento) throws Exception {
    if ((orientamento != 'A') && (orientamento != 'B') && (orientamento != 'D') && (orientamento != 'S')) {
      throw new Exception();
    }
    this.orientamento = orientamento;
  }

  public char getOrientamento() {
    return orientamento;
  }

  // altri metodi
  public void ruotaDestra() {
    switch (orientamento) {
      case 'A':
        orientamento = 'D';
        break;
      case 'D':
        orientamento = 'B';
        break;
      case 'B':
        orientamento = 'S';
        break;
      case 'S':
        orientamento = 'A';
        break;
    }
  }

  public void ruotaSinistra() {
    switch (orientamento) {
      case 'A':
        orientamento = 'S';
        break;
      case 'D':
        orientamento = 'A';
        break;
      case 'B':
        orientamento = 'D';
        break;
      case 'S':
        orientamento = 'B';
        break;
    }
  }

  public void sposta(double distanza) {
    switch (orientamento) {
      case 'A':
        setY(getY() + distanza);
        break;
      case 'B':
        setY(getY() - distanza);
        break;
      case 'S':
        setX(getX() - distanza);
        break;
      case 'D':
        setX(getX() + distanza);
        break;
    }
  }

  public boolean equals(PuntoOrientato po) {
    return (super.getX() == po.getX() && super.getY() == po.getY() && this.getOrientamento() == po.getOrientamento());
  }

  public String toString() {
    return super.toString() + orientamento;
  }

  public static void main(String[] args) {
    PuntoOrientato po1 = new PuntoOrientato();
    PuntoOrientato po2 = new PuntoOrientato();
    PuntoOrientato po3 = new PuntoOrientato();
    PuntoOrientato po4 = new PuntoOrientato();
    try {
      po1 = new PuntoOrientato(1., 1., 'D');
      po2 = new PuntoOrientato(2., 2., 'A');
      po3 = new PuntoOrientato(po1);
      po4 = new PuntoOrientato(0., 0., 'X');
    } catch (Exception e) {
      System.out.println("Generata eccezione");
    }
    System.out.println("PO1 = " + po1.toString());
    System.out.println("PO2 = " + po2.toString());
    System.out.println("PO3 = " + po3.toString());
    System.out.println("Distanza PO1-PO2 = " + po1.distanza(po2));
    System.out.println("Distanza PO1-PO3 = " + po1.distanza(po3));
    if (po1.equals(po3)) {
      System.out.println("PO1 e PO3 coincidono");
    } else {
      System.out.println("PO1 e PO3 non coincidono");
    }
    po1.ruotaSinistra();
    System.out.println("PO1 = " + po1.toString());
    po1.sposta(10.0);
    System.out.println("PO1 = " + po1.toString());
  }
}
