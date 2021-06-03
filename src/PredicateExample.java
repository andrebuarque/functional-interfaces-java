import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<LocalDate> maiorDeIdade = dataNascimento -> {
            return dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS) >= 18;
        };

        System.out.println(maiorDeIdade.test(LocalDate.of(1985, 10, 5)));
    }
}
