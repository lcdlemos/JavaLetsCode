public class Main {
    public static void main(String[] args){

        // Imprimir os números de 1 a 10
        int i;
        System.out.println("Imprimindo verticalmente");
        for(i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("\nImprimindo horizontalmente");
        for(i = 1; i <= 10; i++){
            System.out.printf("%d ", i);
        }

        System.out.println("\n\nImprimindo Ímpares 2 a 2");
        for(i = 1; i <= 50; i+=2){
            System.out.printf("%d ", i);
        }

        System.out.println("\n\nTabuada de 1 a 10");
        for(i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}