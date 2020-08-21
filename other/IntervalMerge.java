
public class IntervalMerge {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        int[][] result = interval_merge(matrix);

        for(int row=0; row < result.length; row++){
            for(int column=0; column < result[row].length; column++) {
                System.out.printf("%d ", result[row][column]);
            }
            System.out.print(", ");
        }

    }

    static int[][] interval_merge(int[][] matrix){
        int[][] copy_array = copy(matrix);

        int counter = 0;
        for(int row=0; row < copy_array.length - 1; row++){
            int[] range1 = {copy_array[row][0], copy_array[row][1]};
            int[] range2 = {copy_array[row + 1][0], copy_array[row + 1][1]};
            if(has_overlap(range1, range2)) {
                copy_array[row + 1][0] = copy_array[row][0]; 
                copy_array[row][0] = -1;
                copy_array[row][1] = -1;
                counter++;
            }   
        }

        int[][] result = new int[matrix.length - counter][2];
        int idx = 0;
        for(int[] row_elem : copy_array) {
            if(row_elem[0] != -1 && row_elem[1] != -1) {
                result[idx][0] = row_elem[0];
                result[idx][1] = row_elem[1];
                idx++;
            }
        }

        return result;
    }

    static int[][] copy(int[][] input) {
        int[][] result = new int[input.length][input[0].length];
        for(int row=0; row < input.length; row++){
            for(int column=0; column < input[row].length; column++) {
                result[row][column] = input[row][column];
            }
        }
        return result;
    }
    
    static boolean has_overlap(int[] range1, int[] range2) {
        if(range2[0] < range1[1]) {
            return true;
        }
        return false;
    }
}