package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIsLazy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        /**
         * Nothing will be printed in the output as there is no terminal operation -
         * which triggers the intermediate operations performed
         */
        Stream<Integer> lazy = numbers.stream().filter(val -> val>=3).peek(System.out::println);

        /**
         * count is considered as one of the terminal operations
         * hence you will get the output.
         */
        Stream<Integer> nums = numbers.stream().filter(val -> val>=3).peek(System.out::println);
        nums.count();

    }
}
