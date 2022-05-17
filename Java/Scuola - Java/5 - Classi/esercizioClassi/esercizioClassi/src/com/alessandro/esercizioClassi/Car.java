// Creo una classe Car all'interno del package
package com.alessandro.esercizioClassi;

public class Car {
  // Proprietà
  public int porte;
  public String modello;

  // Metodo setter per impostare una proprietà
  public void setModello(String modello) {
    // L'argomento accettato verrà attribuito alla proprietà modello
    // Aggiunta di controlli sull'attributo
    String validaModello = modello;
    if (validaModello.equals("Seat Leon")) {
      this.modello = modello;
    } else {
      this.modello = "modello sconosciuto";
    }
  }

  // Metodo getter per recuperare una proprietà, il getter è tipizzato a seconda
  // della proprietà
  public String getModello() {
    return this.modello;
  }
}