import java.util.function.IntConsumer;

public class Accept {

    public static void main(String []args) {
        IntConsumer display = a -> System.out.println(a * 10);
        display.accept(3);
    }
    
}
