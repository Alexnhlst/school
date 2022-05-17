public class Cliente {
  // proprietà private, limitate a questa classe
  private String nome;
  private int annoNascita;

  // getters e setters, accessibili nello spazio pubblico
  public String getNome() {
    return nome;
  }

  public int getAnnoNascita() {
    return annoNascita;
  }

  public void setNome(String nome) {
    // Aggiunta di controlli di condizione
    if (nome == "Mario" || nome == "Luigi") {
      System.out.printf("Ciao %s, accesso consentito.\n", nome);
      this.nome = nome;
    } else {
      System.out.printf("Utente sconosciuto.\n");
    }
  }

  public void setAnnoNascita(int annoNascita) {
    // Aggiunta di controlli di condizione
    if (annoNascita >= 1965 && annoNascita <= 2000) {
      System.out.printf("Ingresso consentito\n");
      this.annoNascita = annoNascita;
    } else {
      System.out.printf("Ingresso negato.\n");
    }
  }

  // Metodo per la verifica di entrambe le proprietà
  public String validaIngresso(String nome, int annoNascita) {
    this.nome = nome;
    this.annoNascita = annoNascita;
    if ((nome == "Mario" || nome == "Luigi") && (annoNascita >= 1965 && annoNascita <= 2000)) {
      return "Ingresso consentito";
    } else {
      return "Ingresso non consentito";
    }
  }
}
