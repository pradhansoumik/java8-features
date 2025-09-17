import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfEachCharacterInString {
    public static void main(String[] args) {
        String str = "aabbcfgasdfflllg";
        //IntStream chars = str.chars();

        str.chars()
           .mapToObj(c -> (char)c)
           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
           .forEach((k,v) -> System.out.println(k + " : " + v));

        //same approach would be followed for Frequency of each element in an Array.
    }
}
