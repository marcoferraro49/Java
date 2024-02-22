public class Main {
    public static void main(String[] args) {
        char [] arr1 = {'a', 'c', 'a', 'c', 'c'};
        char [] charArr = createArr(arr1);
        char toFind = 'c';
        System.out.println("Numero occorrenze : " + occurrences(toFind, charArr));
    }
    public static char[] createArr (char [] arr1){
        char[] charArr = new char [5];
        for (int i = 0; i < charArr.length; i++){
            charArr[i] = arr1[i];
        }
        return charArr;
    }

    public static int occurrences (char toFind, char [] charArr){
        int occ = 0;
        for (int i = 0; i < charArr.length; i++){
            if (charArr[i] == toFind){
                occ +=1;
            }
        }
        return occ;
    }
}