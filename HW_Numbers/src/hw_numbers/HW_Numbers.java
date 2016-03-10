/*
 22.	Напишите программу, которая будет считывать с консоли любое число (от 0 до 99999999) и выводить его в таком виде (см.  рисунок ниже):
Дополнительно: сделайте так, чтобы "большая цифра" состояла не из звёздочек, а из соответствующих маленьких (обычных) цифр.
 */
package hw_numbers;
import Numbers.*;
import java.util.Scanner;
 
public class HW_Numbers { 
    public static void main(String[] args) {
        Numbers.Number[] numberArray; 
        int number, size, tempNumber;  
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Please enter number: ");
        number = sc.nextInt();
        
        tempNumber = number;
        size = 0;
        do{
            size++;
            tempNumber = tempNumber/10;
        }while(tempNumber!=0);
        
        tempNumber = number;
        numberArray = new Numbers.Number[size]; 
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = NumberFactory(tempNumber % 10);
            tempNumber = tempNumber/10;
        }
                
        for (int i = 0; i < 7; i++) {
            for (int j = numberArray.length - 1; j >= 0; j--) {
                numberArray[j].PrintLevel(i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    
    public static Numbers.Number NumberFactory(int number) {
             
        switch(number){
            case 1:
                return new One('1');
            case 2:
                return new Two('2');
            case 3:
                return new Three('3');
            case 4:
                return new Four('4');
            case 5:
                return new Five('5');
            case 6:
                return new Six('6');
            case 7:
                return new Seven('7');
            case 8:
                return new Eight('8');
            case 9:
                return new Nine('9');
            case 0:
                return new Zero('0'); 
            default:
                return null; 
        } 
    }   
}

/* 
Please enter number: 1234567890
   1   	 222   	  333  	   4   	  5555 	   666 	777777 	  888  	 999   	  000  	
  11   	2   2  	 3   3 	  44   	 5     	  6    	     7 	 8   8 	9   99 	 0   0 	
   1   	2   2  	     3 	 4 4   	55555  	 6     	    7  	 8   8 	9   99	 0   0 	
   1   	   2   	   33  	4  4   	     5 	6 66   	   7   	  888  	 999 9 	 0   0 	
   1   	  2    	     3 	444444 	     5 	66  6  	  7    	 8   8 	     9 	 0   0 	
   1   	 2     	 3   3 	   4   	5    5 	6   6  	 7     	 8   8 	    9  	 0   0 	
 11111 	222222 	  333  	   4   	 5555  	 666   	7      	  888  	 999   	  000  	
*/
