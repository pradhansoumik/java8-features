import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int a = 0, b = 1;

//        System.out.print("Fibonacci Series: " + a + ", " + b);
//
//        for (int i = 2; i < n; i++) {
//            int next = a + b;
//            System.out.print(", " + next);
//            a = b;
//            b = next;
//        }
        for(int i = 0; i<=5; i++){
              //System.out.print(fibonacci(i)+" ");
        }

        //using java8 programing
        Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(n)
                .map(f -> f[0])
                .forEach(num -> System.out.print(num + " "));

    }
    static int fibonacci(int n){
        if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
