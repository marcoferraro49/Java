public class Gatto extends Animale {

    public Gatto(String verso) {
        super(verso);
    }

    @Override
    public void faiIlVerso() {
        System.out.println("Il gatto fa: " + verso);
    }
}
