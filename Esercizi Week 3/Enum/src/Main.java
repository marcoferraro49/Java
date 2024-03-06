public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(3.0, 5.0);
        Triangolo triangolo = new Triangolo(6.0, 4.0);

        System.out.println("L'area del " + triangolo.getTipo() + " è: " + triangolo.calcolaArea());
        System.out.println("L'area del " + rettangolo.getTipo() + " è: " + rettangolo.calcolaArea());

    }
}