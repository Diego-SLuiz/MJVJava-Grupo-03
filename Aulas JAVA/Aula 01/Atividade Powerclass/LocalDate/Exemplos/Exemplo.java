import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Exemplo {
    public static void main(String[] args) {

        testOf();
        System.out.println("--------------------------------------------------------");
        testNow();

    }

    static void testOf () {
        //Criando uma data usando LocalDate
        LocalDate data = LocalDate.of(2001, 7, 3);
        //MOSTRANDO A DATA POR COMPLETO
        System.out.println("LocalDate.of - Mostrando a data: " + data);
        //PEGANDO APENAS O ANO DA DATA
        System.out.println("LocalDate.of - [ ANO ] -> " + data.getYear());
        //PEGANDO MES SENDO ELE POR VALOR NUMERICO OU EXTENSO
        System.out.println("LocalDate.of - [ MES ] -> " + data.getMonth());
        System.out.println("LocalDate.of - [ MES EM VALOR ] -> " + data.getMonthValue());
        //PEGANDO DIA DO MES
        System.out.println("LocalDate.of - [ DIA ] -> " + data.getDayOfMonth());
        //PEGANDO DIA DA SEMANA
        System.out.println("LocalDate.of - [ DIA DA SEMANA ] -> " + data.getDayOfWeek());
    }

    static void testNow () {
        //Atribuindo a data de agora em uma variavel LocalDate
        LocalDate dataNow = LocalDate.now();
        LocalDate data = LocalDate.parse("2022-09-22");

        //PEGANOD A DATA POR COMPLETO
        System.out.println("LocalDate.now - Mostrando a data -> " + dataNow);
        //PEGANDO E INSTANCIANDO UM TEMPO.
        System.out.println("LocaDate.now - Mostrando atTime -> " + dataNow.atTime(23, 50, 59));
        //COMPARANDO AS DUAS DATAS.
        System.out.println("Comparando a data [ " + dataNow + " ] com a data [ " + data + " ] -> " + dataNow.compareTo(data));
        /*AJUSTA O OBJETO TEMPORAL ESPECIFACO PARA TER A MESMA DATA QUE ESTE OBJETO
        dataNow = (LocalDate) data.adjustInto(dataNow);
        System.out.println("Esse eu ainda nao entendi - > " +  data.adjustInto(dataNow));
        System.out.println(dataNow);*/
    }
}