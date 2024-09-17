import java.util.*;
import java.util.stream.Collectors;

/**
 * Asked in LTI Mindtree 1st Round
 */
public class MostRepeatedElementsInArray {

//    How do you find the most repeated element in an array?
//    Input :
//    List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
//
//    Output :
//    Most Frequent Element : Pen
//    Count : 3
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String,Long> map = listOfStrings.stream()
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println(map);
        Optional<Map.Entry<String, Long>> entryWithHighestCount = map.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(entryWithHighestCount);

    }

}
