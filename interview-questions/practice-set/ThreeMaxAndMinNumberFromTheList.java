import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxAndMinNumberFromTheList {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,3,5,10,25,1,15,30,28,40,50,60);

        List<Integer> minResult = integers.stream().sorted().limit(3).toList();
        System.out.println("Printing 3 min: "+minResult);

        List<Integer> maxResult = integers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("Printing 3 max: "+maxResult);
    }
}
