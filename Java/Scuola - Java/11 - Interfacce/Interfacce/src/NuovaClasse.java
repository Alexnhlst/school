// Classe che estende la classe, che a sua volta estende le interfacce, ed implementa un'interfaccia
public class NuovaClasse extends ClasseInterfaccia implements Interfaccia3 {
  // Richiamo del metodo con override
  @Override
  public int operazione(int a, int b) {
    return a + b;
  }

  @Override
  public int misuraArea(int x, int y) {
    return x * y;
  }
}
