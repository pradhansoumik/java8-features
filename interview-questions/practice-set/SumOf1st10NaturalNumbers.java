import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOf1st10NaturalNumbers {
    public static void main(String[] args) {
        int[] numbers = {};

        //end element is exclusive
        int sum = IntStream.range(1,11).sum();
        //end element is inclusive
        int sum1 = IntStream.rangeClosed(1,10).sum();
        System.out.println(sum1);
    }
}
