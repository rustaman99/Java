package датаВремяДжава;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar);
        calendar.add(Calendar.WEEK_OF_MONTH,1);
        System.out.println(calendar.getTime());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(calendar.getTime());
        }
    }

