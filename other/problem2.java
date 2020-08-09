import java.util.Scanner;

public class problem2 {

    public static double min(double a, double b) {
        return a < b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt(); 
        int b = scanner.nextInt();
        int g = scanner.nextInt();

        //s_ + 5b_ = g
        // 0 <= s_ <= s
        // 0 <= b_ <= b

        double min_b_1 = -((s - g) / 5.0);
        double max_b_1 = -((0 - g) / 5.0);

        double min_b_2 = 0;
        double max_b_2 = b;

        double new_min_b_ = max(min_b_1, min_b_2);
        double new_max_b_ = min(max_b_1, max_b_2);

        System.out.println(
            Math.floor(new_max_b_) - Math.floor(new_min_b_) >= 1 
            || new_max_b_ - new_min_b_ == 0);
    }
    
}