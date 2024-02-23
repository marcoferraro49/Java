import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeriACaso = {1, 1, 20, -1, 3, -4, 28, 12, 1, 0, 2, -4};
        trovaDuplicati(numeriACaso);
        for (int i = 0; i < numeriACaso.length; i++){
            System.out.print(numeriACaso[i] + " ");
        }
    }

    public static void trovaDuplicati(int[] arrayDiInteri) {
        for (int i = 0; i < arrayDiInteri.length - 1; i++){
            if (arrayDiInteri[i] != -1){
                for (int k = i+1; k < arrayDiInteri.length; k++){
                    if (arrayDiInteri[i] == arrayDiInteri[k]){
                        arrayDiInteri[k] = -1;
                    }
                }
            }
        }
    }
}