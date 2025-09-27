import java.util.Arrays;
import java.util.Comparator;

public class LastElementOfAnArray {
    public static void main(String[] args) {
        int[] arr = {10,45,20,5,20,25,40};

        //System.out.println("Last element of the array is: " + arr[arr.length - 1]);

        int lastElement = Arrays.stream(arr).boxed().skip(arr.length-1).findFirst().get();

        System.out.println(lastElement);
    }
}
