import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurencesInAList {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        Map<String, Long> collect = Arrays.stream(words).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(collect);
    }
}
