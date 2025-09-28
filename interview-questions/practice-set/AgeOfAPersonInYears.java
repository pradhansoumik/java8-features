import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfAPersonInYears {
    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1995, 8, 18);
        LocalDate today = LocalDate.now();

        System.out.println("Your Age: "+ChronoUnit.YEARS.between(birthDay, today));
    }
}
