import java.util.Calendar;

public class CalendarExercise {
    public static void main(String[] args){

        //Método GetInstance obtem o timezone atual local. Usado para inicializar o calendário.
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        //Método GetTime retorna um objeto do tipo Data que representa o tempo do calendário (dia, hora, minuto, timezone e ano).
        System.out.println("Data de hoje: " + calendar1.getTime());
        
        //Método ADD adiciona ou subtrai uma quantidade específica de tempo do calendário.
        calendar2.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("Cinco dias antes do dia de hoje: " + calendar2.getTime());

        //Método After retorna um boolean | faz uma comparação entre datas.
        System.out.println("Calendário1 antes de Calendário2? " + (calendar1.after(calendar2) ? "sim" : "não"));
    }
}