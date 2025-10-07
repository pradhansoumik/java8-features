import java.util.function.Function;

public class FunctionForMapOperation {
    public static void main(String[] args) {
        Function<Integer, Integer> func = (n) -> n*n;
        System.out.println(func.apply(5));

        /**
         * Applies this function to the given argument.
         *
         * @param t the function argument
         * @return the function result
         */
        //R apply(T t);

        Function<String, Integer> strLength = str -> str.length();
        Integer length = strLength.apply("Hello World");
        System.out.println(length);
    }
}
class FunctionExample implements Function<Integer, Integer>{

    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}
