public class Main {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 15;
        System.out.println(val1);
        System.out.println(val2);
        System.out.print(equal(val1, val2));
    }

    public static boolean equal (int val1, int val2){
        return (val1 != val2);
    }
}