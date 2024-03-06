public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(2, 3);
        Triangolo triangolo = new Triangolo(6, 4);

        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());
    }
}