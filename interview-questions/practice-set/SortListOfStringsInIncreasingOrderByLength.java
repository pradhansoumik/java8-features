import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringsInIncreasingOrderByLength {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("soumik","chiku","rumki","Kalyani");

        str.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        //str.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

    }
}
