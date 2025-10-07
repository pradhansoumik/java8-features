import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindTheFirstNonRepeatingCharacters {
    public static void main(String[] args) {
        String str = "swiss";
        Optional<Character> first = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(ch -> ch.getValue() == 1)
                .map(ch -> ch.getKey())
                .findFirst();
        //System.out.println(first.orElse(null));

        //another approach!
        Character result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(result);
    }
}
