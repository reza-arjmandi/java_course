import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long counter = 1;
        while(true) {
            if(!scan.hasNext()){
                break;
            }
            System.out.printf("%d %s%n", counter, scan.nextLine());
            counter++;
        }
    }

}