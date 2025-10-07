import com.sun.source.tree.UsesTree;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringsToUpperCaseUsingMap {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("hello", "world", "java", "stream");

        List<String> ret = strings.stream().map(String::toUpperCase).toList();
        System.out.println(ret);

    }
}
