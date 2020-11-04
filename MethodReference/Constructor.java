import java.util.List;
import java.util.Arrays;

public class Constructor {

    public static void main(String []args) {
        List<String> bike_brands = Arrays.asList("Giant", "Scott", "Trek", "GT");
        bike_brands.stream().map(Bicycle::new).toArray(Bicycle[]::new);
    }

}
