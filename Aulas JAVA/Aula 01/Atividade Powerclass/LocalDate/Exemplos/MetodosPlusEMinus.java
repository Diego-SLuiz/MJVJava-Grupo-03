import java.time.LocalDate;

public class MetodosPlusEMinus {

    public static void main(String [] arguments) {
        /*O método now permite capturar a data atual a partir
        do relógio do sistema, no fuso horário local padrão.*/
        LocalDate today = LocalDate.now();
        System.out.println("Hoje é: " + today);

        /*Os métodos plus e minus são métodos que permitem
         aadicionar ou subtrair unidades de Dias, Meses e Anos
         a datas*/

        //plusDays e minusDays permitem aumentar ou diminuir dias
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Amanhã será: " + tomorrow);
        System.out.println("Ontem foi: " + yesterday);

        System.out.println("-------------------------");
        //plusMonths e minusMonths permitem aumentar ou diminuir meses
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Daqui a um mês será: " + nextMonth);
        System.out.println("Um mês atrás foi: " + lastMonth);

        System.out.println("-------------------------");
        //plusYears e minusYears permitem aumentar ou diminuir anos

        LocalDate nextYear = today.plusYears(1);
        LocalDate lastYear = today.minusYears(1);
        System.out.println("Ano que vem, nesta mesma data será: " + nextYear);
        System.out.println("Ano passado, nesta mesma data foi: " + lastYear);

        System.out.println("-------------------------");

        //O método isLeapYear() permite verificar se o ano em questão, é bissexto
        System.out.println("Este ano é bissexto? " + today.isLeapYear());
        System.out.println("Ano que vem será ano bissexto? " + nextYear.isLeapYear());
        System.out.println("Ano passado foi uma nao bissexto? " + lastYear.isLeapYear());

    }
}
