import java.util.Comparator;
import java.util.List;

public class FindTheSecondHighestNumberInaList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);

        Integer i = numbers.stream().sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).findFirst().orElse(null);
        System.out.println(i);
    }
}
