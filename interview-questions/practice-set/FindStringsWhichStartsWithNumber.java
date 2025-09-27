import java.util.Arrays;
import java.util.List;

public class FindStringsWhichStartsWithNumber {
    public static void main(String[] args) {
        String[] arr = {"1abc", "abc1", "2xyz", "xyz2", "3pqr", "pqr3"};
//        for(String s: arr){
//            if(Character.isDigit(s.charAt(0))){
//                System.out.println(s);
//            }
//        }

        //Using Streams
        List<String> list = Arrays.stream(arr).filter(s -> Character.isDigit(s.charAt(0))).toList();
        System.out.println(list);
    }
}
