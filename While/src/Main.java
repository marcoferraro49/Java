public class Main {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(sum(x));
    }
    public static int sum (int x){
        int i = 0;
        int total = 0;
        while(i < x){
            total += i;
            i++;
        }
        return total;
    }
}