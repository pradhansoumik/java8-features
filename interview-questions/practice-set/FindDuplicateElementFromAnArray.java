import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateElementFromAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1,6,7,8,9,7};
        Set<Integer> seen = new HashSet<>();
        //Using Brute Force
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate element is: " + arr[i]);
                }
            }
        }
        System.out.println("Using Streams");

        Set<Integer> duplicates = Arrays.stream(arr).boxed().filter(i -> !seen.add(i)).collect(Collectors.toSet());
        System.out.println("Duplicate elements are: "+duplicates);
    }
}
