/**
 * @author Nencioni Daniele
 * @version 1.0
 */
public class App {
    public static void main(String[] args) throws Exception {
        Alimentare al1 = new Alimentare("olio", "Italia", 15, 2022, 4);
        NonAlimentare nAl1 = new NonAlimentare("Miniatura", "Inghilterra", 32, "plastica", false);
        NonAlimentare nAl2 = new NonAlimentare("scatola di cartone", "Cina", 0.10, "cartone", true);

        System.out.println(al1.getPrezzo());
        System.out.println(al1.isScaduto());
        al1.applicaSconto();
        System.out.println(al1.getPrezzo());

        System.out.println("-------------------------------");

        System.out.println(nAl1.getPrezzo());
        nAl1.applicaSconto();
        System.out.println(nAl1.getPrezzo());

        System.out.println("-------------------------------");

        System.out.println(nAl2.getPrezzo());
        nAl2.applicaSconto();
        System.out.println(nAl2.getPrezzo());
    }
}
