import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        boolean ret = IntStream.range(0, str.length()/2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        System.out.println("provided String is palindrome - "+ret);
    }
}
