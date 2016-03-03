package hw2_calendar;

/**
 *
 * @author Arkadiy
 */

import java.util.*;

public class Hw2_calendar {
    public static void main(String[] args) {
        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.printf("Current date: %td %tB %tY %n",gcalendar.getTime(),gcalendar.getTime(),gcalendar.getTime());  
        System.out.print("Please enter amount of days: ");
        
        //gcalendar.get(Calendar.DATE),gcalendar.get(Calendar.MONTH),gcalendar.get(Calendar.YEAR)
    }
    
}
