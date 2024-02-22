public class Main {
    public static void main(String[] args) {
        int [] numbers = createArr();
        System.out.println(sum(numbers));
    }
    public static int[] createArr (){
        int[] numbers = new int [10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
        }
        return numbers;
    }
    public static int sum (int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }
        return total;
    }
}