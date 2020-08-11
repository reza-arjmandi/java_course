import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unique {

    static public int count(int[] array, int element){
        int _count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                _count++;
            }
        }
        return _count;
    }

    static public List<Integer> unique(int[] array) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if(count(array, array[i]) == 1) {
                result.add(array[i]);
            }
        }
        return result;
    }
 
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size_of_array = scanner.nextInt();
        int[] array = new int[size_of_array];
        for(int i = 0; i < size_of_array; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> unique_arrray = unique(array);

        System.out.print("{ ");
        for(int i : unique_arrray) {
            System.out.printf("%d, ", i);
        }
        System.out.println(" }");
        
    }
}