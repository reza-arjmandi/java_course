import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.printf("%s %s%n", Capitalize(A), Capitalize(B));
    }

    public static String Capitalize(String str) {
        return (str.substring(0,1)).toUpperCase() + str.substring(1);
    }
}