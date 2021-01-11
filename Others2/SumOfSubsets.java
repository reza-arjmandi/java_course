import java.util.ArrayList;

public class SumOfSubsets {

    static void print_all_subsets(String str, int index, String pref) {

        int len_str = str.length();

        if(index == len_str) {
            return;
        }

        System.out.println(pref);

        for(int i = index + 1; i < len_str; i++) {
            pref += str.charAt(i);
            print_all_subsets(str, i, pref);
            pref = pref.substring(0, pref.length()-1);
        }

    }
    
    
	public static void main(String[] args) {
        String str = "abc";
        String pref = "";
        int index = -1;
        print_all_subsets(str, index, pref);
    }
}
