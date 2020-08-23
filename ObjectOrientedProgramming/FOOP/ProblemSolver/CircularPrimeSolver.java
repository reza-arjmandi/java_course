package ProblemSolver;

import java.util.ArrayList;
import java.util.List;

import DataAcquisition.IDataAcquisition;

public class CircularPrimeSolver implements IProblemSolver {

    public CircularPrimeSolver(IDataAcquisition data_acquisition){
        _data_acquisition = data_acquisition;
        _outputs = new ArrayList<>();
    }

    @Override
    public void solve() {
        List inputs = _data_acquisition.get_inputs();
        _outputs.add(how_many_circular_number_contains((int)inputs.get(0)));
    }

    @Override
    public List get_outputs() {
        return _outputs;
    }

    private int how_many_circular_number_contains(int number){
        int count = 0;
        for(int i = 2;i <= number; i++) {
            if(is_circular(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean is_circular(int number) {
        if(!is_prime(number) || has_zero(number)){
            return false;
        }

        // for(int num : permutations(number)) {
        for(int num : cyclic_permutations(number)) {
            if(!is_prime(num)){
                return false;
            }
        }

        return true;
    }

    private boolean has_zero(int number) {
        String number_str = "" + number;
        return number_str.contains("0");
    }

    private List<Integer> cyclic_permutations(int number) {
        List<Integer> result = new ArrayList<Integer>();
        int num = number; 
        int n = count_digits(number); 
        while (true) { 
            result.add(num);  
  
            // Following three lines generates a 
            // circular pirmutation of a number. 
            int rem = num % 10; 
            int dev = num / 10; 
            num = (int)((Math.pow(10, n - 1)) * 
                                rem + dev); 
  
            // If all the permutations are  
            // checked and we obtain original 
            // number exit from loop. 
            if (num == number)  
                break;  
        } 
        return result;
    }

    private int count_digits(int number) 
    { 
        int count = 0; 
        while (number>0) { 
            count++; 
            number = number / 10; 
        } 
        return count; 
    } 

    private List<Integer> permutations(int number) {
        List<Integer> result = new ArrayList<Integer>();
        String number_str = "" + number;
        permutations(number_str, "", result);
        return result;
    }

    private void permutations(String str, String ans, List<Integer> result) {
        if(str.length() == 0) {
            result.add(Integer.parseInt(ans));
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1);
            permutations(ros, ans + ch, result);
        }
    }

    private boolean is_prime(int number) {
        if(number == 2) {
            return true;
        }

        if(number % 2 == 0) {
            return false;
        }
        
        for(int i = 3; i <= Math.sqrt(number); i+= 2) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private List _outputs;
    private IDataAcquisition _data_acquisition;
    
}