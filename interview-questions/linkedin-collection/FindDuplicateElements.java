import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,2,3);

        //approach-1
        Map<Integer, Long> map = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);

        System.out.println("====================================");
        //approach-2
        numbers.stream().filter(n -> numbers.indexOf(n) != numbers.lastIndexOf(n)).distinct().forEach(System.out::println);

        System.out.println("====================================");
        //approach-3
        Set<Integer> duplicates = numbers.stream().filter(n -> Collections.frequency(numbers,n)>1).collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
