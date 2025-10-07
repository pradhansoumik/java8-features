import java.util.Arrays;
import java.util.List;

public class FindAvgOfAListOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40);
        numbers.stream().mapToInt(n -> n).average().ifPresent(System.out::println);
    }
}
