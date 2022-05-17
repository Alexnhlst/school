// La classe eredita da delle interfacce
public class ClasseInterfaccia implements Interfaccia1, Interfaccia2 {
  // Richiamo dei metodo con override
  @Override
  public void invioMessaggio(String messaggio) {
    System.out.printf("Implementazione dell'interfaccia: %s\n", messaggio);
  }

  @Override
  public int operazione(int a, int b) {
    return a * b;
  }
}
