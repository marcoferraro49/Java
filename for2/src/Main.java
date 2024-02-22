public class Main {
    public static void main(String[] args) {
        function(10, 8);
    }
    public static void function (int x, int lim){
        int start = x;
        for (int i = 0; i < lim; i++){
            System.out.print(start + " ");
            start--;
        }
    }
}