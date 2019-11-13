package visualCalender;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class testCanlender {

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        String strDate;

        System.out.println("Please input your data:");
        strDate = scan.nextLine();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(strDate);
        Calendar c = new GregorianCalendar();
        c.setTime(date);

        int maxDays = c.getActualMaximum(Calendar.DATE);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("日\t" + "一\t" + "二\t" + "三\t" + "四\t" + "五\t"+ "六\t");

        c.set(Calendar.DAY_OF_MONTH, 1);
        for (int i=0; i<c.get(Calendar.DAY_OF_WEEK)-1; i++) {
            System.out.print("\t");
        }

        for (int i=1; i<=maxDays; i++) {
            if (day == c.get(Calendar.DAY_OF_MONTH))
                System.out.print(i+"*\t");
            else
                System.out.print(i+ "\t");
            if (c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                System.out.println();
            c.add(Calendar.DAY_OF_MONTH, 1);
        }
        /*System.out.println();
        System.out.println(c.getActualMaximum(Calendar.DATE));*/
    }
}
