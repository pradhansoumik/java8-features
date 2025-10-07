import java.util.Arrays;

public class FindSumOfNumbersUsingReduce {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,5};

        int sum = Arrays.stream(numbers).reduce(0,Integer::sum);

        System.out.println("Sum of all numbers: "+sum);
    }
}
