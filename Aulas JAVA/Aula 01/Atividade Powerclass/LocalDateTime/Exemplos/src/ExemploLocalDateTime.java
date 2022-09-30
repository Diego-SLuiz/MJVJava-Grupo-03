import java.time.LocalDateTime;

public class ExemploLocalDateTime
{
    public static void main(String [] arguments)
    {
        // Exemplo 1
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Obter data e hora atual:");
        System.out.println(agora);

        // Exemplo 2
        String dataHoraTexto = "2007-12-03T10:15:30";
        LocalDateTime dataHoraConvertida = LocalDateTime.parse(dataHoraTexto);
        System.out.println("Obter data e hora a partir de uma String:");
        System.out.println(dataHoraConvertida);
        System.out.println(dataHoraConvertida.getClass());

        // Exemplo 3
        System.out.println("Obter o dia da semana de uma data:");
        System.out.println(dataHoraConvertida.getDayOfWeek());

        // Exemplo 4
        LocalDateTime amanha = LocalDateTime.parse("2022-09-30T22:36:41.078572800");
        Boolean resultado = agora.isAfter(amanha);
        System.out.println("Comparando duas datas:");

        if (resultado)
            System.out.println("A data " + agora + " vem depois da data " + amanha);

        else
            System.out.println("A data " + agora + " NAO vem depois da data " + amanha);
    }
}
