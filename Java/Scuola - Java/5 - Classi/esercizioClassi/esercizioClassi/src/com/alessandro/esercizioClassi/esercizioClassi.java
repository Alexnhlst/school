package com.alessandro.esercizioClassi;

public class esercizioClassi {
    public static void main(String[] args) throws Exception {
        // Istanzio un oggetto a partire dalla classe definita nel package
        Car leon = new Car();
        // Utilizzo il setter per impostare una proprietà
        leon.setModello("Seat Leon");
        // Output del modello usando il getter
        System.out.printf("Modello: %s", leon.getModello());
        // Istanzio un nuovo oggeto per effettuare la verifica dell;attributo
        Car ibiza = new Car();
        ibiza.setModello("Seat Ibiza");
        System.out.printf("\nModello: %s", ibiza.getModello());
    }
}
