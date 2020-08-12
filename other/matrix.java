import java.util.Scanner;

public class matrix {

    public static int[][] spiral_numbers(int n) {
        int[][] matrix = new int[n][n];

        int counter = 1;
        for (int step = 0; step < n/2; step++) {
            counter = spiral_step(n, matrix, counter, step);
            if (n % 2 == 1) {
                matrix[n/2][n/2] = n * n;
            }
        }
        return matrix; 
    }

    private static int spiral_step(int n, int[][] matrix, int counter, int step) {
        int number_in_each_side = (n - step * 2 - 1);
        for (int i = 0; i < 4 * number_in_each_side; i++) {
            int side = i / number_in_each_side;
            
            int chunkIndex = i % number_in_each_side;
            int chunkOffset = n - step - 1;
            switch (side) {
                case 0:
                    matrix[step][chunkIndex + step] = counter;
                    break;
                case 1:
                    matrix[chunkIndex + step][chunkOffset] = counter;
                    break;
                case 2:
                    matrix[chunkOffset][chunkOffset - chunkIndex] = counter;
                    break;
                case 3:
                    matrix[chunkOffset - chunkIndex][step] = counter;
                    break;
                default:
                    throw new IndexOutOfBoundsException();
            }
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int number = scanner.nextInt();
        
        int array[][] = spiral_numbers(array_size);

        for(int i = 0; i < array_size; i++) {
            for(int j = 0; j < array_size; j++) {
                if(number == array[i][j]) {
                    System.out.printf("%d, %d%n", i, j);
                }
            }
        }

   }
}