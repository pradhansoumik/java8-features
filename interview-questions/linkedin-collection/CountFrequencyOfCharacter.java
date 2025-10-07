import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacter {
    public static void main(String[] args) {

        String input = "java";

        Map<Character, Long> map = input.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(map);
    }
}
