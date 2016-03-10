/*
 * 14.	Написать программу, которая генерирует календарь на любой год, указанный с клавиатуры.
 */
package hw5_calendar.generator;
import java.time.Month;
import java.util.*;
public class Hw5_calendarGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year,weeks,firstWeekDays,month;
        GregorianCalendar gc;
        
        System.out.printf("Please enter the YEAR: ");  
        year = sc.nextInt();
        gc = new GregorianCalendar(year,0,1);        
        weeks = gc.getWeeksInWeekYear();
        firstWeekDays = (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)? 6 :gc.get(Calendar.DAY_OF_WEEK)-2;
        month = gc.get(Calendar.MONTH) + 1;
        System.out.println(Month.of(month));    

        while (gc.get(Calendar.YEAR) == year) {              
            for (int i = 0; i < firstWeekDays; i++) {
            System.out.printf("   ");
            }
            
            for (int j = firstWeekDays; j < 7; j++) {
                System.out.printf("%2d ",gc.get(Calendar.DATE));   
                gc.add(Calendar.DATE,1);
                firstWeekDays = 0;
                if(month != gc.get(Calendar.MONTH) + 1){ 
                    if(j!=6)
                        firstWeekDays = j+1;
                    else
                        firstWeekDays = 0;
                    month = gc.get(Calendar.MONTH) + 1;   
                    if(gc.get(Calendar.YEAR) == year)
                        System.out.printf("\n\n%s",Month.of(month)); 
                    break;
                }
            }
            System.out.println();            
        } 
    } 
}
/*
Please enter the YEAR: 2016
JANUARY
             1  2  3 
 4  5  6  7  8  9 10 
11 12 13 14 15 16 17 
18 19 20 21 22 23 24 
25 26 27 28 29 30 31 

FEBRUARY
 1  2  3  4  5  6  7 
 8  9 10 11 12 13 14 
15 16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 

MARCH
    1  2  3  4  5  6 
 7  8  9 10 11 12 13 
14 15 16 17 18 19 20 
21 22 23 24 25 26 27 
28 29 30 31 

APRIL
             1  2  3 
 4  5  6  7  8  9 10 
11 12 13 14 15 16 17 
18 19 20 21 22 23 24 
25 26 27 28 29 30 

MAY
                   1 
 2  3  4  5  6  7  8 
 9 10 11 12 13 14 15 
16 17 18 19 20 21 22 
23 24 25 26 27 28 29 
30 31 

JUNE
       1  2  3  4  5 
 6  7  8  9 10 11 12 
13 14 15 16 17 18 19 
20 21 22 23 24 25 26 
27 28 29 30 

JULY
             1  2  3 
 4  5  6  7  8  9 10 
11 12 13 14 15 16 17 
18 19 20 21 22 23 24 
25 26 27 28 29 30 31 

AUGUST
 1  2  3  4  5  6  7 
 8  9 10 11 12 13 14 
15 16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 

SEPTEMBER
          1  2  3  4 
 5  6  7  8  9 10 11 
12 13 14 15 16 17 18 
19 20 21 22 23 24 25 
26 27 28 29 30 

OCTOBER
                1  2 
 3  4  5  6  7  8  9 
10 11 12 13 14 15 16 
17 18 19 20 21 22 23 
24 25 26 27 28 29 30 
31 

NOVEMBER
    1  2  3  4  5  6 
 7  8  9 10 11 12 13 
14 15 16 17 18 19 20 
21 22 23 24 25 26 27 
28 29 30 

DECEMBER
          1  2  3  4 
 5  6  7  8  9 10 11 
12 13 14 15 16 17 18 
19 20 21 22 23 24 25 
26 27 28 29 30 31 
*/