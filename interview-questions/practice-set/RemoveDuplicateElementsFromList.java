import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10,2,4,7);

        List<Integer> distinctNumbers = numbers.stream().distinct().sorted().collect(Collectors.toList());

        System.out.println(distinctNumbers);
    }
}
