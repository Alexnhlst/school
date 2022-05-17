public class App {
    public static void main(String[] args) throws Exception {
        // Istanziamento di un oggetto
        OperazioniPoli numero = new OperazioniPoli();
        // Metodo in polimorfismo con tipo int
        int sommaInteri = numero.operazione(9, 5);
        // Output della variabile
        System.out.printf("La somma degli interi: %d\n", sommaInteri);
        // Metodo in polimorfismo con tipo double
        double sommaDecimale = numero.operazione(10.7, 5.3);
        System.out.printf("La somma dei decimali: %f\n", sommaDecimale);
        System.out.println("======================");
        // Istanziamento oggetti forma e quadrato
        Forma rettangolo = new Forma();
        Quadrato q1 = new Quadrato();
        // Metodo della classe Forma
        int perimetro = rettangolo.calcolaMisure(5, 7);
        // Metodo della classe Quadrato con polimorfismo
        double perimetro1 = q1.calcolaMisure(10.8, 4.2);
        // Metodo della classe Quadrato con override
        int area = q1.calcolaMisure(3, 4);
        // Output dei risultati
        System.out.printf("Perimetro del rettangolo %d cm\n", perimetro);
        System.out.printf("Perimetro del quadrato %f cm\n", perimetro1);
        System.out.printf("Area del quadrato %d cm\u00B2\n", area);
        System.out.println("======================");
        // Istanziamento oggetti clienti
        Cliente toscana = new Cliente();
        ClienteEstero francia = new ClienteEstero();
        // Uso del setter
        francia.setBudget(100);
        toscana.setBudget(50);
        // Output del budget
        System.out.printf("Budget cliente francese %d\n", francia.getBudget());
        System.out.printf("Budget cliente toscana %d", toscana.getBudget());
    }
}
