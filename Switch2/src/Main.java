public class Main {
    public static void main(String[] args) {
        char x = '*';
        System.out.println(check(x));
    }

    public static String check (char x){
        switch (x){
            case ('+'):
                return "Addizione";
            case ('-'):
                return "Sottrazione";
            case ('*'):
                return "Moltiplicazione";
            case ('/'):
                return "Divisione";
            default:
                return "Errore";
        }
    }
}