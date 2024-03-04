public class Gatto extends Animale {

    private String name = "Micio";

    public String getName() {
        return name;
    }

    @Override
    public void faiIlVerso() {
        System.out.println("verso del gatto");
    }
}
