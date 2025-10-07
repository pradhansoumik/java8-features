import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge2UnsortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8,10};

        int[] array = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
