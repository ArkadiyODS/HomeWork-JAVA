/*
22.Ввести число в диапазоне от 0 до 1000000. Озвучить его словами. 
Например, при вводе числа 25 вывести на экране «двадцать пять».
 */
package numbertotext;

import java.util.Scanner;

public class NumberToText {
     private static String[][] letters = { 
    //below 19
         {"","один ","два ","три ","четыре ","пять ","шесть ","семь ","восемь ","девять ",
         "десять ", "одиннадцать ","двенадцать ","тринадцать ","четырнадцать ","пятнадцать ",
         "шестнадцать ","семнадцать ","восемнадцать ","девятнадцать "}, 
    // from 20 to 90   
         {"двадцать ", "тридцать ","сорок ","пятьдесят ","шестьдесят ","семьдесят ",
         "восемьдесят ","девяносто "},
   // from 100 to 900
         {"", "сто ","двести ","триста ","четыреста ","пятьсот ","шестьсот ","семьсот ",
             "восемьсот ","девятьсот "},
   // 1000 & billion
         {"тысяча ","тысячи ","тысяч ","один миллион ","ноль "} 
     };

    public static void main(String[] args) {
        int number, temp;
        int[] array = new int[7]; 
        StringBuilder str = new StringBuilder();
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Введите число: ");
        number = sc.nextInt();
        
        if(number < 0 && number > 1000000) {
            System.out.println("Число должно быть в дипазоне от 0 до 1000000");
            return;
        }
        else if(number == 0 ) {
            str.append(letters[3][4]);
        }
        else if(number ==  1000000) {
            str.append(letters[3][3]);
        }
        else{
            
            temp = number;
        for (int i = array.length-1; i >= 0 ; i--) {
            array[i] = temp % 10;
            temp /= 10;
        }  
        
        /* 
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        */
        if(number >= 1000){  
        str.append(letters[2][array[1]]);
         
        if(array[2] > 1){
            str.append(letters[1][array[2]-2]);
        }
        else if(array[2] == 1) {
            str.append(letters[0][array[3]+10]);
            array[3] = 0;
        }
        
        str.append(letters[0][array[3]]);
        
        
        if(array[3] == 1)
            str.append(letters[3][0]);
        else if (array[3] < 5)
            str.append(letters[3][1]);
        else
            str.append(letters[3][2]);
        }
        str.append(letters[2][array[4]]);
        
        if(array[5] > 1){
            str.append(letters[1][array[5]-2]);
        }
        else if(array[5] == 1){
            str.append(letters[0][array[6]+10]);
            array[6] = 0;
        } 
        str.append(letters[0][array[6]]);
        }
        System.out.println();
        System.out.println(str.toString()); 
        
    } 
}

/*
Введите число: 456874
четыреста пятьдесят шесть тысяч восемьсот семьдесят четыре 

Введите число: 5
пять 

Введите число: 999999 
девятьсот девяносто девять тысяч девятьсот девяносто девять 

Введите число: 804000 
восемьсот четыре тысячи 

Введите число: 354 
триста пятьдесят четыре 
*/