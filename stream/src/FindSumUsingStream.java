import java.util.Arrays;
import java.util.List;

public class FindSumUsingStream {
    public static void main(String[] args) {

        Integer[] input = new Integer[]{1,2,3,4};

        findSumInArray(input);
    }

    private static void findSumInArray(Integer[] input) {
        List<Integer> list = Arrays.asList(input);
        long sum = list.stream().mapToLong(Integer::longValue).sum();
        System.out.println("Printing Sum = "+sum);
    }
}
