public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Matrice di partenza: ");
        stampa(matrix);

        int[][] matrix2 = change (matrix);
        System.out.println("Matrice risultato: ");
        stampa(matrix2);
    }
    public static void stampa(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] change (int [][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;

        int[][] check = new int [column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                check[j][i] = matrix[i][j];
            }
        }
        return check;
    }
}