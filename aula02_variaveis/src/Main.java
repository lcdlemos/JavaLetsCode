public class Main {
    public static void main(String[] args) {

        int a;
        int b = 2;
        a = 3;

        int soma = a + b, subtracao = a - b, multiplicacao = a * b;
        float divisao = (float) a/b;    //Cast para que a divisão seja real

        System.out.println("\nSoma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
    }
}