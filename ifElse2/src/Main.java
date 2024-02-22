public class Main {
    public static void main(String[] args) {
        String name = "Giovanni";

        if (name.length() > 10){
            System.out.println("Lunghezza maggiore di 10");
        } else if (name.length() < 10){
            System.out.println("Lunghezza minore di 10");
        } else {
            System.out.println("Lunghezza pari a 10");
        }
    }
}