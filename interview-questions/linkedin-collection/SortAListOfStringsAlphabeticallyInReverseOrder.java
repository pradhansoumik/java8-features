import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAListOfStringsAlphabeticallyInReverseOrder {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> namesInReverseOrder = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(namesInReverseOrder);
    }
}
