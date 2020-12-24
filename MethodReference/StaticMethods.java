import java.util.Arrays;
import java.util.List;

class StringUtils {

    public static String capitalize(String input) {
        return input;
    }
}

class StaticMethods {
    
    public static void main(String []args){
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
        messages.forEach(word -> StringUtils.capitalize(word));
        messages.forEach(StringUtils::capitalize);

        for (String message : messages) {
            System.out.println(message);
        }
    }
}