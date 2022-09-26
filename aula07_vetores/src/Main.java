import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;

        System.out.printf("%d, %d, %d, %d, %d\n", numero1, numero2, numero3, numero4, numero5);
        System.out.println(numero1 + numero2 + numero3 + numero4 + numero5);

        int numeros[] = new int[5]; // Colchetes define que é um array, depois declara sem tamanho
        // numeros[] = numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
        }

        // Usando letras
        String letras[] = new String[5];

        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";

        System.out.println("\n");
        for(int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        for(int i = 0; i < letras.length; i++){
            System.out.printf("%s ", letras[i]);
        }

        String novasLetras[] = {"X", "Y", "Z", "W", "K"};
        System.out.println("\n");
        for(int i = 0; i < novasLetras.length; i++){
            System.out.println(novasLetras[i]);
        }

        for(int i = 0; i < novasLetras.length; i++){
            System.out.printf("%s ", novasLetras[i]);
        }

        System.out.println("\n");
        System.out.println(Arrays.toString(novasLetras));

        int[] outrosNumeros = {9, 18, 12, 25, 1};
        int maior = outrosNumeros[0], menor = outrosNumeros[0], media = 0;

        for(int i = 0; i < outrosNumeros.length; i++){
            if(outrosNumeros[i] > maior){
                maior = outrosNumeros[i];
            }
            if(outrosNumeros[i] < menor){
                menor = outrosNumeros[i];
            }
            media += outrosNumeros[i];
        }

        System.out.println("\n");
        System.out.println(Arrays.toString(outrosNumeros));
        System.out.println("Maior Valor: " + maior);
        System.out.println("Menor Valor: " + menor);
        System.out.println("Média: " + media/outrosNumeros.length);
    }
}