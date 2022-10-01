import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class ExemploLocalDateTime
{
    public static void main(String [] arguments)
    {
        // Exemplos LocalDateTime - atividade e dinâmica Powerclass
        ExemploLocalDateTime.primeiroExemplo();
        ExemploLocalDateTime.segundoExemplo();
        ExemploLocalDateTime.terceiroExemplo();
        ExemploLocalDateTime.quartoExemplo();
    }

    static void primeiroExemplo()
    {
        // Exemplo 1 - Obter a data e hora atual
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Obtendo a data e a hora atual:");
        System.out.println("A data e hora e: " + agora + "\n");
    }

    static void segundoExemplo()
    {
        // Exemplo 2 - Converter uma string em uma data com hora
        String dataHoraTexto = "2007-12-03T10:15:30";
        LocalDateTime dataHoraConvertida = LocalDateTime.parse(dataHoraTexto);
        System.out.println("Obter data e hora a partir de uma String");
        System.out.println("String original: " + dataHoraTexto);
        System.out.println("Data e hora convertida: " + dataHoraConvertida);
        System.out.println("Classe do objeto obtido: " + dataHoraConvertida.getClass() + "\n");
    }

    static void terceiroExemplo()
    {
        // Exemplo 3 - Obtendo o dia da semana de uma determinada data
        LocalDateTime agora = LocalDateTime.now();
        DayOfWeek hoje = agora.getDayOfWeek();
        System.out.println("Obter o dia da semana de uma determinada data");
        System.out.println("A data " + agora);
        System.out.println("Fica no dia " + hoje + "\n");
    }

    static void quartoExemplo()
    {
        // Exemplo 4 - Validando se uma determinada data excede outra
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime amanha = agora.plusDays(1);
        Boolean resultado = agora.isAfter(amanha);

        System.out.println("Comparando duas datas:");

        if (resultado)
            System.out.println("A data " + agora + " vem depois da data " + amanha + "\n");

        else
            System.out.println("A data " + agora + " NAO vem depois da data " + amanha + "\n");
    }
}
