public class Main {
    public static void main(String[] args) {
        System.out.println(function(2, 10));
    }
    public static int function (int val1, int val2){
        val1 += 5;
        val2 -= 5;
        return val1 * val2;
    }
}