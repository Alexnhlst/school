// Superclasse (parent class)
public class Animale {
  // Costruttore
  public Animale(String nome, int misura, int peso) {
    this.nome = nome;
    this.misura = misura;
    this.peso = peso;
  }

  // Variabili con attributi comuni
  public String nome;
  public int misura;
  public int peso;

  // Metodi comuni
  public void mangiare() {
    System.out.println("Invoco Animale.mangiare()");
  }

  public void muovere() {
    System.out.println("Invoco Animale.muovere()");
  }

  // Getter
  public String getNome() {
    return nome;
  }

  public int getMisura() {
    return misura;
  }

  public int getPeso() {
    return peso;
  }

  // Setter
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setMisura(int misura) {
    this.misura = misura;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }
}
