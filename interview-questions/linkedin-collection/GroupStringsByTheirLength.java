import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByTheirLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "bat", "car", "apricot", "banana", "cat");

        Map<Integer, List<String>> collect = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
