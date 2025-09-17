import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinListOfStringWithPrefixSuffixDelimeter {
    public static void main(String[] args){
        List<String> items = Arrays.asList("Java", "Spring", "Microservices", "Python");

        String prefix = "[";
        String suffix = "]";
        String delimiter = " || ";

        //using stream API
        String result = prefix + items.stream().collect(Collectors.joining(delimiter)) + suffix;
        //System.out.println("Joined Output: " + result);

        String res = items.stream().collect(Collectors.joining(delimiter, prefix, suffix));
        System.out.println("Joined Output: " + res);

    }
}
