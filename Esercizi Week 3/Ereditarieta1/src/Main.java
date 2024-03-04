public class Main {
    public static void main(String[] args) {

        Animale animale = new Animale();
        Gatto gatto = new Gatto();

        System.out.println("Il gatto si chiama: " + gatto.getName());

        animale.faiIlVerso();
        gatto.faiIlVerso();

    }
}