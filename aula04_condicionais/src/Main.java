public class Main {
    public static void main(String[] args){

        double nota = 7.5;      // Não sei o motivo, mas não aceitou float

        // Se nota do aluno maior ou igual a 7.0, então está aprovado
        if(nota >= 7.0){
            System.out.println("Aluno aprovado com nota " + nota + ".");
        }
        else{
            System.out.println("Aluno reprovado com nota " + nota + ".");
        }

        String conceito;

        // Usando conceitos A (acima de 9), B (entre 8 e 9), C (entre 7 e 8) e D (abaixo de 7)
        if(nota >= 9){
            conceito = "A";
        }
        else if(nota < 9 && nota >= 8){
            conceito = "B";
        }
        else if(nota < 8 && nota >= 7){
            conceito = "C";
        }
        else if (nota < 7){
            conceito = "D";
        }
        else{
            conceito = null;
        }

        // Usando o switch
        switch(conceito){
            case "A" : System.out.println("Aluno com conceito A");
            break;
            case "B" : System.out.println("Aluno com conceito B");
            break;
            case "C" : System.out.println("Aluno com conceito C");
            break;
            case "D" : System.out.println("Aluno com conceito D");
            break;
            default : System.out.println("Nota Inválida!");
        }

    }
}