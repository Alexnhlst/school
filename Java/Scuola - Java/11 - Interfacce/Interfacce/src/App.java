public class App {
    public static void main(String[] args) throws Exception {
        // classe che implementa un'interfaccia
        Interfaccia1 nuovoMsg = new ClasseInterfaccia();
        Interfaccia2 risultato = new ClasseInterfaccia();
        Interfaccia3 nuovaArea = new NuovaClasse();
        // Istanziamento di un oggetto della classe
        NuovaClasse nuovoRis = new NuovaClasse();
        nuovoMsg.invioMessaggio("Hello, world");
        System.out.println(risultato.operazione(10, 2));
        System.out.println(nuovoRis.operazione(10, 2));
        System.out.println(nuovaArea.misuraArea(10, 2));
    }
}
