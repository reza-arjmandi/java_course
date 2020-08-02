import java.util.Scanner;
import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

public class JavaSubstringComparisons {

    public static String min(List<String> list) {
        String result = list.get(0);
        for(int i=0; i < list.size(); i++){
            String elem = list.get(i);
            if (elem.compareTo(result) < 0) {
                result = elem; 
            }
        }
        return result;
    }

    public static String max(List<String> list) {
        String result = list.get(0);
        for(int i=0; i < list.size(); i++){
            String elem = list.get(i);
            if (elem.compareTo(result) > 0) {
                result = elem; 
            }
        }
        return result;
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // --------------------Solution1------------------------------
        // SortedSet<String> sets = new TreeSet<String>();
        // for(int i=0; i<=s.length()-k; i++){
        //     sets.add(s.substring(i, i+k));
        // }
        // smallest = sets.first();
        // largest =sets.last();

        // --------------------Solution2------------------------------
        // List<String> permutations = new ArrayList<>();
        // for(int i=0; i<=s.length()-k; i++){
        //     permutations.add(s.substring(i, i+k));
        // }

        // smallest = min(permutations);
        // largest = max(permutations);
        

        // --------------------Solution3------------------------------
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        for(int i=0; i<=s.length()-k; i++){
            String permutation = s.substring(i, i+k);
            if(permutation.compareTo(smallest) < 0) {
                smallest = permutation;
            }
            if(permutation.compareTo(largest) > 0) {
                largest = permutation;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}