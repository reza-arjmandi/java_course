import java.util.Scanner;

public class problem3 {

    public static int sum (int[] array){
        int total = 0;
        for (int i = 0; i<array.length; i++){
            total += array[i];
        }
        return total;
    }

    public static int sum (int[] array, int[] mask){
        int total = 0;
        for (int i = 0; i<array.length; i++){
            if(mask[i] == 1) {
                total += array[i];
            }
        }
        return total;
    }

    public static void partition( int [] array, int[] mask, int counter, boolean[] result) {
        if (counter == 0) {
             if(sum(array, mask) == sum(array)/2) {
                 result[0] = true;
             }
        } else {
            mask[counter - 1] = 0;
            partition(array, mask, counter-1, result);
            mask[counter - 1] = 1;
            partition(array, mask, counter-1, result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt(); 
        int[] numbers = new int[count];
        int[] mask = new int[count];
        boolean[] result = new boolean[count]; 
        for(int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            mask[i] = 1;
            result[i] = false;
        }

        partition(numbers, mask, count, result);
        System.out.println(result[0]);
    }
}