public class Main {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(getUnicodeCharacter(str, 6));
    }

    public static StringBuilder getUnicodeCharacter (String str, int index){
        StringBuilder result = new StringBuilder();
        if(index > 0 && index <= str.length()){
            char char1 = str.charAt(index);
            result.append("Il carattere in Unicode all'indice ").append(index).append(" è: ").append(Integer.toHexString(char1 | 0x10000).substring(1));
        } else {
            result.append("Indice non valido");
        }
        return result;
    }
}