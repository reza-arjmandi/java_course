
import java.io.*;
import java.util.*;
import java.util.InputMismatchException;

public class JavaExceptionHandling_Try_catch {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}