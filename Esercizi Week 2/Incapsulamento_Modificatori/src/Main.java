public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto(1600, "AB123AC", "Fiat", "Panda");
        Auto auto2 = new Auto (1400, "ZZ123AZ", "Opel", "Crossland X");
        System.out.println(auto1.getCilindrata() + auto1.getTarga() + auto1.getMarca() + auto1.getModello());

        System.out.println("L'auto2 è -> " + auto2);

        auto2.setTarga("ZZ123AB");
        System.out.println("L'auto2 è -> " + auto2);

    }
}