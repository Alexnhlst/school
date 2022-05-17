public class Visibilita {
  public static void main(String[] args) {
    // Istanziamento di un oggetto della classe Private
    Private persona = new Private();
    /*
     * Impossibile accedere alle proprietà dell'oggetto
     * persona.nome = "Mario";
     */
    // Metodo per visualizzare le proprietà
    persona.informazioni();
    /*
     * Impossibile accedere al metodo privato
     * persona.iscrizione()
     */
    // Invocazione metodo public
    persona.permettiIscrizione();

    // Istanziamento di un oggetto della classe protected
    Protected nuovoGatto = new Protected("Norvegese", "Gialli");
    System.out.println(nuovoGatto.razzaGatto);
    // Istanziamento di un oggetto con overload
    Protected gatto2 = new Protected();
    // null
    System.out.println(gatto2.razzaGatto);
    // Cambio proprietà
    nuovoGatto.razzaGatto = "Norvegese";
    // Invocazione metodo
    nuovoGatto.miagola("Alaska");
  }

}