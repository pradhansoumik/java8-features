import java.util.stream.IntStream;

public class StreamVsParallelStream {
    public static void main(String[] args) {

        long startTime = 0;
        long endTime = 0;
        // Using Stream
        System.out.println("Using Stream:");
        startTime = System.currentTimeMillis();
        IntStream.rangeClosed(1, 1000000000).filter(i -> i==1000000000).forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken using (Stream): " + (endTime - startTime) + " ms");

        // Using Parallel Stream
        System.out.println("\nUsing Parallel Stream:");
        startTime = System.currentTimeMillis();
        IntStream.rangeClosed(1, 1000000000).parallel().filter(i -> i==1000000000).forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken using(Parallel Stream): " + (endTime - startTime) + " ms");
    }
}
