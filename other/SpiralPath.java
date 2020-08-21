import java.util.Scanner;

public class SpiralPath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int find = scanner.nextInt();
        System.out.println(spiral_path(number, find));
    }

    public static int spiral_path(int number, int find) {
        int[][] matrix = produce_matrix(number);
        int[] spiral_array = produce_spiral_array(matrix, number);
        return find_number(spiral_array, find);
    }

    public static int find_number(int[] spiral_array, int find)  {
        return spiral_array[find-1];
    }

    public static int[][] produce_matrix(int number) {
        int[][] matrix = new int[number][number];
        int counter = 1;
        for(int row=0; row < number; row++ ){
            for(int column=0; column < number; column++ ){
                matrix[row][column] = counter++;
            }
        }
        return matrix; 
    }

    public static int[] produce_spiral_array(int[][] matrix, int number) {
        int length = matrix.length;
        int index = 0;
        int[] result = new int[length*length];
        result[index++] = matrix[length/2][length/2];
        for (int step = (number/2) - 1; step >= 0 ; step--) {
            index = spiral_step(number, matrix, result, step, index);
        }
        return result; 
    }

    private static int spiral_step(int number, int[][] matrix, int[] result, int step, int index) {
        int number_in_each_side = (number - step * 2 - 1);
        for (int i = 0; i < 4 * number_in_each_side; i++) {
            int side = i / number_in_each_side;
            int chunkIndex = (number_in_each_side - 1) - (i % number_in_each_side);
            int chunkOffset = number - step - 1;
            int row_index = 0;
            int column_index = 0;
            switch (side) {
                case 0: 
                    row_index = step;
                    column_index = chunkIndex + step;
                    break;
                case 1:
                    row_index = chunkOffset - chunkIndex;
                    column_index = step;
                    break;
                case 2:
                    row_index = chunkOffset;
                    column_index = chunkOffset - chunkIndex;
                    break;
                case 3:
                    row_index = chunkIndex + step;
                    column_index = chunkOffset;
                    break;
                default:
                    throw new IndexOutOfBoundsException();
            }
            result[index] = matrix[row_index][column_index];
            index++;
        }
        return index;
    }
    
}