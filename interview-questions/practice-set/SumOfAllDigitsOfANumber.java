public class SumOfAllDigitsOfANumber {
    public static void main(String[] args) {

        int number = 12345;
        int sum = 0;

        // Approach 1: Using while loop
        int num = number; // to preserve the original number
        while (num != 0) {
            sum += num % 10; // add the last digit to sum
            num /= 10;       // remove the last digit
        }
        System.out.println("Sum of digits (while loop): " + sum);

        // Approach 2: Using String conversion and streams
        int sumStream = String.valueOf(number)
                              .chars() // convert to IntStream of character codes
                              .map(c -> c - '0') // convert char code to actual digit
                              .sum(); // sum all digits
        System.out.println("Sum of digits (stream): " + sumStream);
    }
}
