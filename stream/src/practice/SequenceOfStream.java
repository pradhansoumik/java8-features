package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequenceOfStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        Stream<Integer> nums =   numbers.stream()
                                .filter(val -> val>=3)
                                .peek(val -> System.out.println("After Filter: "+val))
                                .map(val -> val*-1)
                                .peek(val -> System.out.println("After Map negating: "+val))
                                .sorted()
                                .peek(val -> System.out.println("After Sorting: "+val));

        List<Integer> list = nums.collect(Collectors.toList());

    }
}
