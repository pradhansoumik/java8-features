import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintMultipleOf5FromTheList {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2,3,5,10,25,1,15);

        List<Integer> result = integers.stream().filter(n -> n%5 == 0).sorted().toList();
        System.out.println(result);

    }
}
