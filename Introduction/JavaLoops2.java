import java.util.*;
import java.io.*;
import java.lang.Math;

public class JavaLoops2 {
    
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(series(a,b,n));
        }
        in.close();
    }

    public static String series(int a, int b, int n) {
        String result = "";
        for(int sentence=0; sentence < n; sentence++) {
            result = result + nth_sentence(sentence, a, b) + " ";
        }
        return result;
    }

    public static int nth_sentence(int sentence_number, int a, int b) {
        int result = a;
        for(int j=0; j <= sentence_number; j++){
            result += Math.pow(2, j) * b;
        }
        return result;
    }
}