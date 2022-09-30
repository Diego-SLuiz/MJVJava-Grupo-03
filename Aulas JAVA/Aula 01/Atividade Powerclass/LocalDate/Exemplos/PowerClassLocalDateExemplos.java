import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
//LocalDate
public class PowerClass {

    public static void main(String[] args){

        //data dd MM yyyy Padrão ISO de datas

        //Instanciando a variavel agora com a Classe LocaDate e o metodo now();
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        //Formatando a data em número
        System.out.println(LocalDate.of(2022, 8, 1));
        //Convertendo um data String com LocalDate
        System.out.println(LocalDate.parse("2019-02-01"));
        //Bom exemplo abaixo para um programa de lembrete ou agenda adicionando dias na data autual
        System.out.println(agora.plusDays(30));
        //Diminuindo 1 Mês na data - voltando no tempo
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));
        //Printando qual o dia da Semana
        System.out.println(agora.getDayOfWeek());
        //Printando qual o dia do Mês
        System.out.println(agora.getDayOfMonth());
        //Printando qual o dia do Ano
        System.out.println(agora.getDayOfYear());
        //Para saber se é um ano bisexto
        System.out.println(agora.isLeapYear());
        //Para saber se algum ano foi bisexto passando um data.
        System.out.println(LocalDate.parse("2020-02-01").isLeapYear());
    }
}
