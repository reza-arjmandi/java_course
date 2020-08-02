import java.util.Scanner;

public class JavaStdInOut1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

}