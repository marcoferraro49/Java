public class Rettangolo implements Forma{

    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcolaArea() {
        return base*altezza;
    }
}
