public class Triangolo extends Forma{

    private int base;
    private int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        System.out.println("L'area del triangolo è: " + (base*altezza)/2);
    }
}
