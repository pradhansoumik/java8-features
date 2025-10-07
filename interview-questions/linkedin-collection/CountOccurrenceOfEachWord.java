import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrenceOfEachWord {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

        Map<String, Long> collect = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(collect);



    }
}
