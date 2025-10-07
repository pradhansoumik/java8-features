import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Map - Transformation (one-to-one mapping)
 * FlatMap - Transformation + Flattening (one-to-many mapping)
 */
public class MapVsFlatMap {
    public static void main(String[] args) {

        /**
         * Takes a function that returns a value.
         * Map: <R> Stream<R> map(Function<? super T, ? extends R> mapper);
         * Transforms each element T into a single value R. Output: Stream<R>
         *
         */

        /**
         * example:
         * Each String becomes an Integer.
         * Function<String, Integer> → one-to-one mapping.
         */
        List<String> names = Arrays.asList("Java", "Stream", "Map");
        Stream<Integer> integerStream = names.stream().map(str -> str.length());// Stream<Integer> [4, 6, 3]
        System.out.println("Map output: "+integerStream.toList());

        /**
         * Takes a function that returns a stream
         * FlatMap: <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
         * Transforms each element T into a Stream of R and then flattens all those streams.
         * Output: Stream<R> [flattened]
         */
        /**
         * example:
         * Each List<String> becomes a Stream<String>, and flatMap() flattens it.
         * Function<List<String>, Stream<String>> -> one-to-many mapping.
         * Output: Stream<String>
         */

        List<List<String>> nested = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("Microservices", "Streams")
        );

        Stream<String> flatMap = nested.stream()
                .flatMap(List::stream); // Stream<String> [Java, Spring, Microservices, Streams]

        System.out.println(flatMap.toList()); // [Java, Spring, Microservices, Streams]

        /**
         * example:
         * Each String becomes a Stream<String> (split words).
         * Function<String, Stream<String>> → one-to-many mapping, then flattened.
         */
        List<String> phrases = Arrays.asList("Java Streams", "are powerful");

        List<String> allWords = phrases.stream().flatMap(phrase -> Arrays.stream(phrase.split(" ")))
                .toList(); // Stream<String> [Java, Streams, are, powerful]
        System.out.println(allWords);


        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<Customer> customers = EkartDataBase.getAll();
        List<String> list = customers.stream().flatMap(cus -> cus.getPhoneNumbers().stream()).toList(); // List<List<String>>
        System.out.println(list);
    }


}
