/*
 * 7.	Пользователь вводит с клавиатуры время начала и время завершения телефонного разговора (часы, минуты и секунды). 
 * Посчитать стоимость разговора, если стоимость минуты составляет 15 копеек, с учётом посекундной тарификации.
 */
package javaapplication1;  
import java.text.*;
import java.util.*;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int minutePrice = 15;
        long dayInMlseconds = 86400000, conversationTime = 0;
        Date start, end;
        SimpleDateFormat tf = new SimpleDateFormat("HH:mm:ss");
        
        System.out.print("Please enter start time in format HH:mm:ss: ");
        String startTime = sc.nextLine();
        
        System.out.print("Please enter end time in format HH:mm:ss: ");
        String endTime = sc.nextLine();
        
                
        try{
            start = tf.parse(startTime);
            end = tf.parse(endTime);  
        }catch (ParseException e){
            System.out.println("Wrong format of input: " + e.getMessage());
            return;
        }   
            if(end.getTime() < start.getTime()) 
                conversationTime += dayInMlseconds; 
            
            conversationTime += end.getTime() - start.getTime();
            System.out.printf("Conversation duration: %d sec %nConversation price: %.2f uah",conversationTime/1000,(float)(conversationTime)/60000*minutePrice);   
            System.out.println();  
        
    }
    
}
