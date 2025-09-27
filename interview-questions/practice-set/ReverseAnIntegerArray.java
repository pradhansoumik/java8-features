import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseAnIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //Integer[] arr1 = {1,2,3,4,5};
        //Arrays.stream(arr1).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<Integer> integerList = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList();
        System.out.println(integerList);
    }
}
