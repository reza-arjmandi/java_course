import java.util.function.IntConsumer;

public class AndThen {

    public static void main(String[] args) {
        IntConsumer display = a -> System.out.println(a * 10);
        IntConsumer mul = a -> a *= 10;
        IntConsumer composite = mul.andThen(display);
        composite.accept(3);
    }
    
}
