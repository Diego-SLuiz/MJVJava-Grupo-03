import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExemplosLocalDate {

    public static void main(String [] arguments) {
        //MÉTODO of()
        //Criando uma data do tipo LocalDate
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

        //MÉTODO plusDay

//        LocalDate today = LocalDate.now();
//        System.out.println("Data de hoje: " + today);
//
//        //plusDays permite aumentar qtd de dias
//        LocalDate tomorrow = today.plusDays(1);
//        System.out.println("Amanhã será: " + tomorrow);
//
//        System.out.println("-------------------------");
//        //de forma análoga, temos os métodos plusWeek, plusMonth e plusYear
//        LocalDate nextWeek = today.plusWeeks(1);
//        LocalDate nextMonth = today.plusMonths(1);
//        LocalDate nextYear = today.plusYears(1);
//
//        System.out.println("Daqui a uma semana será: " + nextWeek);
//        System.out.println("Daqui a um mês será: " + nextMonth);
//        System.out.println("Ano que vem, nesta mesma data será: " + nextYear);

        //MÉTODO minus()

//        LocalDate today = LocalDate.now();
//        System.out.println("Data de hoje: " + today);
//        //utilizando minus(TemporalAmount amountToSubtract)
//        LocalDate lastWeek = today.minus(Period.ofWeeks(1));
//        LocalDate tenMonthsAgo = today.minus(Period.ofMonths(10));
//        LocalDate twentyYearsAgo = today.minus(Period.ofYears(20));
//
//        System.out.println("Semana passada: " + lastWeek);
//        System.out.println("Dez meses atrás: " + tenMonthsAgo);
//        System.out.println("Vinte anos atrás: " + twentyYearsAgo);
//
//        //Utilizando ,minus(long amountToSubtract, TemporalUnit unit)
//        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
//        LocalDate aMonthAgo = today.minus(1, ChronoUnit.MONTHS);
//        LocalDate twoYearsAgo = today.minus(2, ChronoUnit.YEARS);
//
//        System.out.println("Data de ontem: " + yesterday);
//        System.out.println("Um mês atrás: " + aMonthAgo);
//        System.out.println("2 anos atrás: " + twoYearsAgo);

    }
}
