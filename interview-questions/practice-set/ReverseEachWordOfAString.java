import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordOfAString {
    public static void main(String[] args) {
        String str = "Hello World from Java";

        String reverseWord = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverseWord);//olleH dlroW morf avaJ


    }
}