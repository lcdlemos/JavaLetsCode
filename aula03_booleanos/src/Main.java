public class Main {
    public static void main(String[] args) {

        boolean resultado = false;

        System.out.println("\nResultado = " + resultado);

        boolean fimDeSemana = false, fazendoSol = true;
        boolean vamosPraia = fimDeSemana && fazendoSol;

        System.out.println("Vamos a Praia? " + vamosPraia);

        // Tabela Verdade

        // Operador AND ou E (&&)               Operador OR ou OU (||)
        // false && false = false               false && false = false
        // false && true = false                false && true = true
        // true && false = false                true && false = true
        // true e true = true                   true e true = true

        // Operador Ternário (?)
        // Apresenta 3 termos: a variável testada, o resultado se verdadeiro, o resultado se falso

        String mensagem = fimDeSemana ? "É fim de semana!" : "Não é fim de semana.";

        System.out.println(mensagem);
    }
}