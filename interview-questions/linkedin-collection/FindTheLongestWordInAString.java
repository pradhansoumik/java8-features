import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTheLongestWordInAString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","date");

        //approach-1
        String longestWord1 = words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed()).findFirst().orElse(null);

        //approach-2
        String longestWord2 = words.stream()
                .max(Comparator.comparingInt(String::length)).orElse(null);

        System.out.println(longestWord2);
    }
}
