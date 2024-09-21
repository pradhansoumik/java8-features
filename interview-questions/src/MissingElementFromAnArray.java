import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementFromAnArray {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,7,8,9,10};
        int[] arr1 = {1,2,3,4,6,7,8,9,10,11,13,14,15,20};
        //findMissingNumber(arr);
        System.out.println("printing missing numbers: "+findMissingNumbers(arr1));
    }

    private static void findMissingNumber(int[] arr) {
        System.out.print("printing sum of natural numbers: ");
        int n = arr.length + 1;
        int totalSum = n * (n+1)/2;
        System.out.println(totalSum);
        System.out.print("printing sum of the numbers present inside array: ");
        /*int arraySum = 0;
        for (int j : arr) {
            arraySum += j;
        }*/
        int arraySum = Arrays.stream(arr).sum();//java 8 approach
        System.out.println(arraySum);

        System.out.println("printing the missing number: "+(totalSum - arraySum));
    }

    private static List<Integer> findMissingNumbers(int[] arr) {

        List<Integer> list = new ArrayList<>();
        int n = arr[arr.length-1];//last element of an Array
        boolean[] present = new boolean[n+1];
        //assume that Array is sorted already!
        for(int num : arr){
            if(num <= n) {
                present[num] = true;
            }
        }
        //System.out.println(Arrays.toString(present));
        for(int i = 1; i<n; i++){
            if(!present[i]){
                list.add(i);
            }
        }
        return list;
    }

}