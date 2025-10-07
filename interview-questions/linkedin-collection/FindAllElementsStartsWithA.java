import java.util.Arrays;
import java.util.List;

public class FindAllElementsStartsWithA {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex");
        names.stream().filter(n -> n.startsWith("A")).toList().forEach(System.out::println);

    }
}
