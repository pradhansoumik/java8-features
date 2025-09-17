import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Merge2UnsortedArrayIntoSingleSortedArray {
    public static void main(String[] args) {

        Integer[] arr1 = {45, 12, 78, 5};
        Integer[] arr2 = {33, 90, 1, 66};

        Object[] merged = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(merged));

        //Merge 2 Unsorted Array Into Single Sorted Array without duplicates!
    }
}
