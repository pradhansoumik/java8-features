import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinInAList {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,3,5,10,25,1,15);

        Integer max = integers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("MAX -> "+max);
        Integer min = integers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("MIN -> "+min);
    }
}
