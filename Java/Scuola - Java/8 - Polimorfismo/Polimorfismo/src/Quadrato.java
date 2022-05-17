public class Quadrato extends Forma {
  // Override del metodo calcoloMisure
  @Override
  public int calcolaMisure(int a, int b) {
    int area = a * b;
    return area;
  }

  // Polimorfismo con tipo double
  public double calcolaMisure(double base, double altezza) {
    double perimetro1 = (base * 2) + (altezza * 2);
    return perimetro1;
  }
}
