import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomFunctionalInterface cfi = () -> {
            String msg = "Hello there!";
            return msg+" A Custom Functional Interface.";
        };
        CustomFunctionalInterface cfi1 = () -> "A Custom Functional Interface without return.";
        System.out.println(cfi.getName());
        System.out.println(cfi1.getName());

        Runnable runnable = () -> System.out.println("Thread is running ...");
        Thread thread = new Thread(runnable);
        thread.start();
        runnable.run();

        List<String> list = new ArrayList<String>();
        list.add("Soumik");
        list.add("Anupam");
        list.add("Sourabh");

        list.forEach(n -> System.out.println(n));
    }
}