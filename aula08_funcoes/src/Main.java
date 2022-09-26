public class Main {
    public static void main(String[] args) {

        String nome = "Luizão";
        System.out.println("Hello, " + nome + "!");

        saudacao(nome);

        System.out.println("Soma: " + soma(2, 3));
    }

    public static void saudacao(String nomeParametro){      // nome e nomeParametro podem ser iguais ou não
        System.out.println("Hello, " + nomeParametro + ", Agora na Função!");
    }

    public static int soma(int parcela1, int parcela2){
        return(parcela1 + parcela2);
    }
}