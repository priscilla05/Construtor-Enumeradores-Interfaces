package calendario;

import java.util.Calendar;

public class ClasseCalendar {
    public static void main(String[] args) {
        //Recuperação da data com a classe Calendar

        System.out.println("==> Recuperação da data com a classe Calendar");
        Calendar calendar = Calendar.getInstance();
        System.out.println("Data e hora atual:" + calendar.getTime() + "\n");

        System.out.println("Ano:" + calendar.get(Calendar.YEAR));
        System.out.println("Dia do mês" + calendar.get(Calendar.DAY_OF_MONTH) + "\n");

        System.out.println("==>Alterando a data/hora com método set");
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println("Data/Hora atual:" + calendar.getTime());
        System.out.println("Ano:" + calendar.get(Calendar.YEAR));
        System.out.println("Dia do mês:" + calendar.get(Calendar.DAY_OF_MONTH) + "\n");

        //Recuperando a hora do dia

        System.out.println("==> Recuperando a hora do dia");
        Calendar calendar1 = Calendar.getInstance();

        int hora = calendar1.get(Calendar.HOUR_OF_DAY);

        System.out.println("Agora são:" + hora + "hrs");
        if (hora > 6 && hora < 12) {
            System.out.println("Bom dia");
        } else if(hora > 12 && hora <18){
            System.out.println("Boa tarde");
        }else{
            System.out.println("Boa noite");
        }

        }
    }
