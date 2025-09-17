import java.util.Arrays;
import java.util.List;

public class SecondLargestNumberInAnArray {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,3,5,10,25,1,15,30,28,40,50,60);

        int secondLargest = integers.stream().sorted().skip(1).findFirst().get();

        System.out.println("Second Largest Number: "+secondLargest);
    }
}
