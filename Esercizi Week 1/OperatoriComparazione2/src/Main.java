public class Main {
    public static void main(String[] args) {
        char val1 = 'a';
        char val2 = 'A';
        System.out.println(val1);
        System.out.println(val2);
        System.out.print(equal(val1, val2));
    }

    public static boolean equal (char val1, char val2){
        return (val1 != val2);
    }
}