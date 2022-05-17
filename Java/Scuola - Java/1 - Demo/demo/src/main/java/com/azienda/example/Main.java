package com.azienda.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world");

    // Numeri interi
    int numero = 23;
    // Numeri float
    float decimale = 3;
    // Double ha doppia precisione, ma più memoria allocata
    double doppio = 3.14;
    double somma = decimale + doppio;
    // Modificatori
    long ampio = 45;
    short ristretto = 20;
    // Stringhe
    String testo = "Hello world!";
    // Booleani
    boolean prova = true;
    boolean demo = false;
    // Concatenazione variabili
    System.out.printf("Variabile intera = %d \nVariabile double = %.2f \nVariabile long = %d", numero, doppio, ampio);
    System.out.printf("\nSomma = %.2f\n", somma);
    System.out.println(decimale + doppio);
    System.out.println(testo);
    if (prova) {
      System.out.println("La condizione è vera.");
    }
    if (demo) {
      System.out.println("La condizione è vera.");
    }
  }
}
