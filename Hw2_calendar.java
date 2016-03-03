package hw2_calendar;

/**
 *
 * @author Arkadiy
 */

import java.util.*;

public class Hw2_calendar {
    public static void main(String[] args) {
        GregorianCalendar gcalendar = new GregorianCalendar();
        Date dNow = new Date(); 
        long dayInMlseconds = 86400000;
        long tillNow = dNow.getTime();                
        int numberOfDays;
        System.out.printf("Current date: %td %tB %tY %n",gcalendar.getTime(),gcalendar.getTime(),gcalendar.getTime());  
        System.out.print("Please enter amount of days: "); 
        try{
        numberOfDays = (new java.util.Scanner(System.in)).nextInt();
        } catch (InputMismatchException e)
        { 
        System.out.println(e);
        return;
        } 
        tillNow+=dayInMlseconds*numberOfDays; 
        Date next = new Date(tillNow); 
        System.out.printf("Next date (via Date type): %td %tB %tY %n",next,next,next);  
       
        gcalendar.add(Calendar.DATE,numberOfDays);
        System.out.printf("Next date (via GregorianCalendar type): %td %tB %tY %n",gcalendar.getTime(),gcalendar.getTime(),gcalendar.getTime());  
         } 
    }
     
