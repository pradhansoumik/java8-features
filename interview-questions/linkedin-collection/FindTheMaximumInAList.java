import java.util.Arrays;
import java.util.List;

public class FindTheMaximumInAList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,50,30,40);

        int max = numbers.stream().max(Integer::compareTo).get();
        System.out.println("MAX: "+max);

        int min = numbers.stream().min(Integer::compareTo).get();
        System.out.println("MIN: "+min);
    }
}
