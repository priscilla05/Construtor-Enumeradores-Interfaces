package calendario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConversaoDatas {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        Date data = calendario.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data formatada:" + sdf.format(data));

        //Converte Objetos
        //System.out.println("Data convertida:" + sdf.parse("02/06/1970"));

    }
}
