import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class pratice16 {
    public static void main(String[] args) throws IOException {
        String contents = new String(
            Files.readAllBytes(
                Paths.get("/home/arjmandi/code/java_course/SolveIssues/Alice.txt")), 
                StandardCharsets.UTF_8.name());
        List<String> words = Arrays.asList(contents.split("\\PL+"));
        Map<String, Long> frequency = words.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));
        System.out.println(frequency);
        // frequency = frequency.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2)->e2, LinkedHashMap::new));
        // System.out.println(frequency);
    }
}
