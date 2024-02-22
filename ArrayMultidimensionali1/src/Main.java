public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        System.out.println(sumRow(matrix));
    }

    public static int sumRow(int[][] matrix){
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                matrix[x][y] = (int) (Math.random() * 10 + 1);
            }
        }
        int result = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            result += matrix[0][i];
        }
        return result;
    }
}