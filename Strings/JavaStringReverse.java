import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        // --------------solution1--------------
        // System.out.println( A.equals( new StringBuilder(A).reverse().toString()) 
        //     ? "Yes" : "No" );

        // --------------solution2--------------
        // int i=0,j=A.length()-1;
        // while(A.charAt(i)==A.charAt(j) && (i++)<=(j--));
        // System.out.println(i>=j?"Yes":"No");
        
        // --------------solution3--------------
        int lengthOfA = A.length()-1;
        String answer = "Yes";
        for(int i =0; i<lengthOfA/2; i++){
            if(A.charAt(i)==A.charAt(lengthOfA-i))
                continue;
            else{
                answer ="No";
                break;
            }
        }
        System.out.println(answer);
    }
}