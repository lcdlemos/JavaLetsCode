import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){

        String nome = "Luiz Júnior";
        System.out.println(nome);
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome + " apresenta " + nome.length() + " caracteres\n");

        String outroNome = "luiz júnior";
        System.out.println(nome + " é igual a " + outroNome + "? Resposta: " + nome.equals(outroNome));
        System.out.println(nome + " é igual a " + outroNome + "? Resposta: " + nome.equalsIgnoreCase(outroNome) + "\n");

        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA!
        // ISO 8601 representa o padrão de data usado no Java

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "br");     // Se digitar dá erro, mas o Intellij colocou

        System.out.println(hoje);
        // DayOfWeek exibe o dia da semana - DisplayName o estilo do texto e idioma
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        }
        else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        }
        else{
            saudacao = "boa noite";
        }

        System.out.println("\nOlá " + nome + "! Hoje é " + diaSemana + ", " + saudacao.toUpperCase());
        System.out.printf("Olá %s! Hoje é %s, %s.", nome, diaSemana, saudacao.toUpperCase());

    }
}