import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> exibeMensagem = str -> System.out.println(str);
        // ou
        Consumer<String> exibeMensagem2 = System.out::println;

        exibeMensagem.accept("Hello World!"); // Hello World!
        exibeMensagem2.accept("Hello World!"); // Hello World!
    }
}
