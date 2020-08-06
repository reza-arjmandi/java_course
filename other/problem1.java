import java.util.Scanner;
import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

public class problem1 {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String number1 = scanner.next(); 
        final String number2 = scanner.next();
        
        if(number1.length() != number2.length()) {
            return;
        }

        int numbersCountWhichHasSameIndex = 0;
        List<Integer> numbersIndexWhichHasSameIndex = new ArrayList<>();
        
        for(int index = 0; index < number1.length(); index++){
            if(number1.charAt(index) == number2.charAt(index)) {
                numbersCountWhichHasSameIndex++;
                numbersIndexWhichHasSameIndex.add(index);
            }
        }

        int numbersCountWhichDuplicate = 0;
        for(int index = 0; index < number1.length(); index++){

            if(numbersIndexWhichHasSameIndex.contains(index)) {
                continue;
            }

            if(number2.contains(number1.substring(index, index+1))) {
                numbersCountWhichDuplicate++;
            }
        }

        System.out.printf("%d%d%n", numbersCountWhichHasSameIndex, numbersCountWhichDuplicate);

    }    
}