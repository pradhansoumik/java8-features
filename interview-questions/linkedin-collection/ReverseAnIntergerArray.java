import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAnIntergerArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        //1st approach
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();

        //2nd approach
        int[] result = IntStream.rangeClosed(1, arr.length)
                .map(i -> arr[arr.length - i])
                .toArray();

        System.out.println(Arrays.toString(result));
        System.out.println(list);
    }
}
