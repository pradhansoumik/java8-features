import java.util.stream.IntStream;

public class PalindromUsingStream {
    public static void main(String[] args) {
        String str ="madam";
        boolean isPalindrom = IntStream.rangeClosed(0, str.length()/2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
        System.out.println("isPalindrom = " + isPalindrom);
    }
}
