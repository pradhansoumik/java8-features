package practice;

import java.sql.SQLOutput;
import java.util.*;

/**
 * examples of multiple terminal operations
 */
public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        //perform action on each element on stream & don't return any value;
        numbers.stream()
                .filter(val -> val>=3)//.max(Comparator.comparingInt(val -> val));
                .forEach(val -> System.out.println("Printing forEach: "+val));
        //System.out.println("printing max: "+max.get());

        //collect the element of the stream into an array;
        Integer[] array = numbers.stream()
                .filter(val -> val >= 3)
                .toArray((int size) -> new Integer[size]);

        System.out.println("Printing toArray: "+Arrays.toString(array));

        //does reduction on the elements of stream! perform associative aggregation operation;
        Optional<Integer> reduce = numbers.stream()
                .filter(val -> val >= 3)
                .reduce((val1, val2) -> val1 + val2);

        System.out.println("Printing reduce: "+reduce.get());

        // similarly check for other few methods as below -
        // min() -> kind of ascending sorting & gives the first element;
        // max() -> min(val2-val1) = max(val1-val2) => kind of descending sorting & gives the first element;
        // count() -> return the count of elements present in stream;

        //anyMatch() => ignore postgres error handling use case
        //allMatch() => ignore postgres error handling use case

        //findFirst() => 1st element of the stream
    }
}