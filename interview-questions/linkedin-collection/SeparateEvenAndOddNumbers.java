import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeparateEvenAndOddNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};

        Map<Boolean, List<Integer>> collect = Arrays.stream(nums).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> list1 = collect.get(true);
        List<Integer> list2 = collect.get(false);

        System.out.println("Even Numbers: " + list1);
        System.out.println("Odd Numbers: " + list2);
    }
}
