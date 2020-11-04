import java.util.function.IntConsumer; 
  
public class NullPointerException { 
    public static void main(String args[]) 
    { 
        try { 
            IntConsumer mul = a -> a *= 10; 
            IntConsumer composite = mul.andThen(null); 
            composite.accept(3); 
        } 
        catch (Exception e) { 
            System.out.println("Exception : " + e); 
        } 
    } 
} 
