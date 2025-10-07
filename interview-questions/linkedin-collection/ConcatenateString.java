import java.util.Arrays;
import java.util.stream.Collectors;

public class ConcatenateString {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "awesome"};
        String sentence = Arrays.stream(words).collect(Collectors.joining(" "));
        System.out.println(sentence);
    }
}
