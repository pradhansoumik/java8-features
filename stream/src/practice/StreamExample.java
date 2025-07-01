package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * examples of multiple intermediate operations
 */
public class StreamExample {
    public static void main(String[] args) {
        Integer[] arr = {4,2,8,1,2,2,3,4,5,6,1,8,9,2};
        Integer[] peek = {4,2,8,1,2,2,3};

        getDistinctElement(arr);
        getSortedElement(arr);
        getCustomSortedElement(arr);

        getLimit(arr);
        getSkip(arr);
        getPeek(peek);

    }

    /**
     * helps us to see the result of intermediate operation of the stream which is getting processed!
     * for debugging purpose we can use that.
     * @param arr
     */
    private static void getPeek(Integer[] arr) {
        List<Integer> peek = Arrays.stream(arr).filter(val -> val>2).peek(val -> System.out.println(val)).toList();
        System.out.println("PRINTING PEEK >>> "+peek);
    }

    /**
     * skip the first n items (inclusive) from the stream!
     * @param arr
     */
    private static void getSkip(Integer[] arr) {
        Stream<Integer> array = Arrays.stream(arr).skip(3);
        List<Integer> skip = array.collect(Collectors.toList());
        System.out.println("SKIPPING 3 ELEMENT >>> "+skip);
    }

    /**
     * limit use case
     * truncate the stream. to have no longer than given maxsize;
     * @param arr
     */
    private static void getLimit(Integer[] arr) {
        List<Integer> limits = Arrays.stream(arr).limit(3).collect(Collectors.toList());
        System.out.println("LIMIT >>> "+limits);
    }

    /**
     * Descending order sorting
     * @param arr
     */
    private static void getCustomSortedElement(Integer[] arr) {
        List<Integer> sortedElements = Arrays.stream(arr).sorted((val1, val2) -> (val2-val1)).toList();
        System.out.println("DESCENDING ORDER SORTED >>> "+sortedElements);
    }

    /**
     * by-default ascending order sorting
     * @param arr
     */
    private static void getSortedElement(Integer[] arr) {
        List<Integer> sortedElements = Arrays.stream(arr).sorted().distinct().toList();
        System.out.println("ASCENDING ORDER SORTED >>> "+sortedElements);
    }

    /**
     * distinct
     * @param arr
     */
    private static void getDistinctElement(Integer[] arr) {
        List<Integer> distinctElements = Arrays.stream(arr).distinct().collect(Collectors.toList());
        System.out.println("DISTINCT >>> "+distinctElements);
    }
}
