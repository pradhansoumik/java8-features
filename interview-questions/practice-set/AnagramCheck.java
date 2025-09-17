import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = false;

        isAnagram = str1.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .equals(str2.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())));

        System.out.println("Is Anagram -> "+isAnagram);
    }
}
