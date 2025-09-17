import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheListInReverseOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        List<Integer> sortedList = numbers.stream()
                                        .sorted((a,b) -> b-a)
                                        .collect(Collectors.toList());

        /*numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);*/

        System.out.println(sortedList);
    }
}
