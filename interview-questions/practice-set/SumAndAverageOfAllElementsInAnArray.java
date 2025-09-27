import java.util.Arrays;

public class SumAndAverageOfAllElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        //System.out.println("Sum of all elements in an array: " + sum);
        //System.out.println("Average of all elements in an array: " + (sum/arr.length));

        // using streams
        int sum1 = Arrays.stream(arr).sum();
        double avg = Arrays.stream(arr).average().orElse(0);
        System.out.println("Sum of all elements in an array using streams: " + sum1);
        System.out.println("Average of all elements in an array using streams: " + avg);
    }
}
