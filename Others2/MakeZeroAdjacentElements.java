import java.util.ArrayList;
import java.util.Arrays;

public class MakeZeroAdjacentElements {

    public static void main(String[] args) {

        int width = 4;
        int height = 4;

        int[][] matrix ={ {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        for(int[] row : matrix){
            for(int column : row){
                System.out.printf("%d\t", column);
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        make_zero_adjacent(0, 1,matrix, 4, 4);

        for(int[] row : matrix){
            for(int column : row){
                System.out.printf("%d\t", column);
            }
            System.out.println();
        }
    }

    static void make_zero_adjacent(int x, int y, int[][] matrix, int width, int height) {
        matrix[calculate_row_idx(y-1, height)][calculate_column_idx(x-1, width)] = 0;
        matrix[calculate_row_idx(y-1, height)][calculate_column_idx(x, width)] = 0;
        matrix[calculate_row_idx(y-1, height)][calculate_column_idx(x+1, width)] = 0;

        matrix[calculate_row_idx(y, height)][calculate_column_idx(x-1, width)] = 0;
        matrix[calculate_row_idx(y+1, height)][calculate_column_idx(x-1, width)] = 0;

        matrix[calculate_row_idx(y+1, height)][calculate_column_idx(x, width)] = 0;
        matrix[calculate_row_idx(y+1, height)][calculate_column_idx(x+1, width)] = 0;
        
        matrix[calculate_row_idx(y, height)][calculate_column_idx(x+1, width)] = 0;
    }

    static int calculate_column_idx(int column_number, int width) {
        if(column_number == -1) {
            return width - 1; 
        }
        if(column_number == width) {
            return 0;
        }
        return column_number;
    }

    static int calculate_row_idx(int row_number, int height){
        if(row_number == -1) {
            return height - 1; 
        }
        if(row_number == height) {
            return 0;
        }
        return row_number;
    }
    
}
