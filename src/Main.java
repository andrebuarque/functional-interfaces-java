public class Main {
    public static void main(String[] args) {
        Operacao soma = (a, b) -> a + b;
        Operacao subtracao = (a, b) -> a - b;
        Operacao divisao = (a, b) -> a / b;
        Operacao multiplicacao = (a, b) -> a * b;

        System.out.println(soma.calcular(1, 2)); // 3
        System.out.println(subtracao.calcular(5, 1)); // 4
        System.out.println(divisao.calcular(10, 5)); // 2
        System.out.println(multiplicacao.calcular(2, 5)); // 10
    }
}
