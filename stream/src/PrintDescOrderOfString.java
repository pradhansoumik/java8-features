import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintDescOrderOfString {

    public static void main(String[] args) {

        String[] str = new String[]{"Hi", "Test", "Application", "sample", "Hello"};
        findDescendingOrderByLength(str);
    }

    private static void findDescendingOrderByLength(String[] str) {
        List<String> list = Arrays.asList(str);

        Stream<String> sorted = list.stream().sorted(Comparator.comparing(String::length).reversed());
        System.out.println(sorted.collect(Collectors.toList()));
    }
}
