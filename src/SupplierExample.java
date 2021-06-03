import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<LocalDate> dataAtual = () -> LocalDate.now();

        System.out.println(dataAtual.get());
    }
}
