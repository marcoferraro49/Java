public class Main {
    public static void main(String[] args) {

        String str1 = "Ciao";
        String str2 = "Ciao";
        System.out.println(checkString(str1, str2));

    }

    public static StringBuilder checkString (String str1, String str2){
        StringBuilder result = new StringBuilder("Le due stringhe sono ");
        if(str1.equals(str2)){
            result.append("uguali");
        } else {
            result.append("diverse");
        }
        return result;
    }
}