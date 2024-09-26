package LTIInterviewQues;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LTIInterviewQues {

//    How do you find the most repeated element in an array?
//
//
//    Input :
//    List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
//
//    Output :
//    Most Frequent Element : Pen
//    Count : 3

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String, Long> frequencyMap = listOfStrings.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        long maxFrequency = frequencyMap.values().stream().max(Long::compare).orElse(0L);
        List<Map.Entry<String, Long>> mostFrequentElementWithCount = frequencyMap.entrySet().stream().filter(x -> x.getValue().equals(maxFrequency)).toList();

        for(Map.Entry<String, Long> entry: mostFrequentElementWithCount){
            System.out.println("Repeated Elements: " +entry.getKey() + " & count: "+entry.getValue());
        }

    }
}
