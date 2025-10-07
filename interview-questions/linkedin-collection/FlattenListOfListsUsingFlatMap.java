import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfListsUsingFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = List.of(
                List.of(1,2,3),
                List.of(4,5),
                List.of(6,7,8)
        );

        List<Integer> returnList = listOfLists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(returnList);
    }
}
