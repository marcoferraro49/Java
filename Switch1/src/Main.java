public class Main {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(week(x));
    }
    public static String week (int x){
        switch (x){
            case (1):
                return "Lunedi";
            case (2):
                return "Martedi";
            case (3):
                return "Mercoledi";
            case (4):
                return "Giovedi";
            case (5):
                return "Venerdi";
            case (6):
                return "Sabato";
            case (7):
                return "Domenica";
            default:
                return "Errore";
        }
    }
}