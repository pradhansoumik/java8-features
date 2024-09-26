package wippro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Asked in Wipro
 */
public class CountOfCharacters {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = Arrays.asList("soumik","sourabh","aditya");

        //1st approach
        Map<Character, Long> collect = list.stream().flatMap(str -> str.chars().mapToObj(chr -> (char) chr))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(collect);

        //2nd approach
        String collect1 = list.stream().collect(Collectors.joining());
        Map<Character, Long> collect2 = collect1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(collect2);

    }
}
