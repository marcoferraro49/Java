import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Inserisci il numero per cui vuoi calcolare la tabellina");

        x = input.nextInt();
        multiTable(x);
    }

    public static void multiTable(int x) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }
}