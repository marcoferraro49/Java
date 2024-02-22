public class Main {
    public static void main(String[] args) {
        int limMin = 10;
        int limMag = 15;
        int valConfr = 12;
        System.out.println(compare(limMin, limMag, valConfr));
        System.out.println("Limite minore = " + limMin);
        System.out.println("Limite maggiore = " + limMag);
    }
    public static boolean compare (int limMin, int limMag, int valConfr){
        return (limMin < valConfr && limMag > valConfr);
    }
}