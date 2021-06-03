import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Float> dividePorDois = x -> ((float) x / 2);

        System.out.println(dividePorDois.apply(15));
    }
}
