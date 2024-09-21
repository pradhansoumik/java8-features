import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedDistinctElement {


    //(find sorted distinct element starts with 1 -> o/p: [1, 11, 12, 19, 100])
    // Expected output: [1,11,12,19,100]

    public static void main(String[] args) {
        Integer[] arr = {9,5,11,100,5,8,1,7,19,12,8,100,1};
        printSortedDistinctElement(arr);
    }

    private static void printSortedDistinctElement(Integer[] arr) {

        List<Integer> list = Arrays.asList(arr);
        //O/p -> [1, 5, 7, 8, 9, 11, 12, 19, 100]
        List<Integer> integerList = list.stream().filter(x -> x.toString().startsWith("1")).distinct().sorted().toList();

        System.out.println("Printing O/P: "+integerList);

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        //removing duplicates & printing distinct element in ascending order => [7, 9, 11, 12, 19]
        Stream<Integer> integerStream = collect.entrySet().stream().filter(value -> value.getValue() == 1).map(Map.Entry::getKey).sorted();
        //System.out.println(integerStream.collect(Collectors.toList()));
    }
}
