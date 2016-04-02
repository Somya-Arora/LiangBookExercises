package Chapter2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Current time with optional offest
 * */

public class Exercise2_8 {

    public Exercise2_8(){
        System.out.print("Enter the time zone offset to GMT:" );
        Scanner in = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.HOUR);

    }
}