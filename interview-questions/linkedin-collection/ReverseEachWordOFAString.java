import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOFAString {
    public static void main(String[] args) {

        String sentence = "Hello World from Java";
        String result = Arrays.stream(sentence.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
