/*
 16.	В кинотеатре M рядов по N мест в каждом. В двумерном массиве хранится 
информация о проданных билетах. Число 1 означает, что билет на данное место уже 
продан, число 0 означает, что место свободно.  Поступил запрос на продажу K билетов 
на соседние места в одном ряду. Определите, можно ли выполнить такой запрос. 
Число занятых мест, и какие места заняты на момент запроса, определяется случайным 
образом. Вывести исходный массив на экран консоли.
*/
package hw_cinema; 
import java.util.*;

public class HW_Cinema {
    public static void main(String[] args) {
       int rows, sits, neededRow, amountOfSits;
       rows = Input("Введите колличество рядов: " ); 
       sits = Input("Введите колличество мест в ряду: " ); 
       System.out.printf("В кинотеатре %d рядов по %d  мест в каждом\n", rows, sits);
       int[][] cinema = new int[rows][sits];
       Randomiser(cinema,30);
       ShowCinema(cinema);  
       neededRow = Input("Введите ряд в которох нужно купить билеты: " ); 
       amountOfSits = Input("Введите колличество мест: " ); 
       ticketFinder(cinema, neededRow, amountOfSits);
       
    } 
    private static int Input(String text ) {  
       Scanner sc = new Scanner(System.in);
       int input = -1;
         do{ 
           System.out.print(text);
           
           if(sc.hasNextInt())
               input = sc.nextInt(); 
           else { 
               System.out.println("Вводить нужно только цифры. Попробуйте еще раз.");  
               sc.nextLine();
               continue;
           } 
           if(input <= 0) 
               System.out.println("Вводить можно только положительные цифры. Попробуйте еще раз.");   
         }while(input <= 0);
       return input;
    }

    private static void Randomiser(int[][] cinema, int precentage) {
        Random r = new Random();
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if(r.nextFloat() < precentage/100f)
                    cinema[i][j] = 1;
            }
        } 
    }

    private static void ShowCinema(int[][] cinema) { 
        System.out.printf("%3c ",' ');
        for (int j = 0; j < cinema[0].length; j++) {
                System.out.printf("%2d ", j+1);
            }
        System.out.println();
        for (int i = 0; i < cinema.length; i++) {
            System.out.printf("%3d ", i+1);
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.printf("%2d ", cinema[i][j]);
            }
            System.out.println();
        }
    }

    private static void ticketFinder(int[][] cinema, int neededRow, int amountOfSits) {
         if(neededRow > cinema.length) {
             System.out.println("Такого ряда не существует");
             return;
         } 
         if(amountOfSits > cinema[neededRow-1].length) {
             System.out.println("Колличество запрошенных билетов превышает размер ряда");
             return;
         } 
         int ticketSum = 0, start = 0, end = 0;         
         for (int i = 0; i < cinema[neededRow-1].length; i++) {
            if(cinema[neededRow-1][i]  == 0) {
                ticketSum++;   
                end = i;
            }
            else {
                if(ticketSum < amountOfSits) {
                    ticketSum = 0;
                    start = i+1;
                }
                else break;
            }
        }
         if(ticketSum < amountOfSits)
             System.out.println("В данном ряду не хватает свободных мест");
         else
             System.out.printf("Вы можете купить места с %d по %d в %d ряду.\n", start+1, end+1, neededRow);         
    } 
}
/*
Введите колличество рядов:20
Введите колличество мест в ряду:20
В кинотеатре 20 рядов по 20  мест в каждом
     1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 
  1  0  0  1  0  0  1  0  1  0  1  1  0  0  1  1  0  0  1  0  0 
  2  0  0  1  0  0  1  1  0  0  0  1  0  0  1  0  0  0  1  0  1 
  3  0  0  1  0  1  0  0  0  1  0  0  0  0  0  1  0  0  0  0  0 
  4  1  0  1  0  1  0  0  1  0  0  0  0  0  0  0  0  0  1  0  1 
  5  0  0  0  1  0  0  0  1  0  0  0  0  0  0  0  0  0  0  1  1 
  6  1  1  1  0  0  0  0  0  0  0  1  0  0  0  1  1  0  1  0  0 
  7  1  1  0  0  1  0  0  0  0  0  0  0  0  0  1  1  0  1  0  0 
  8  0  0  0  0  0  0  1  0  1  1  0  0  0  0  0  1  1  0  0  1 
  9  0  0  0  1  1  1  0  0  0  0  1  0  0  0  1  0  0  1  0  1 
 10  1  0  0  1  0  0  1  1  0  0  0  0  0  0  0  1  0  1  0  0 
 11  1  0  0  0  0  0  0  0  0  1  0  1  0  0  0  0  0  0  0  1 
 12  1  1  0  1  0  0  0  1  0  0  0  1  1  0  0  1  0  1  1  0 
 13  0  0  0  0  0  0  0  0  1  0  0  0  0  0  1  0  0  0  0  1 
 14  0  1  0  0  0  0  0  0  1  1  0  0  1  0  0  1  0  0  1  0 
 15  0  0  0  1  0  1  0  0  0  0  1  1  1  0  0  1  0  0  1  0 
 16  1  0  0  1  0  0  0  0  0  1  0  1  0  0  0  0  0  1  1  0 
 17  0  0  0  0  0  0  0  0  0  0  0  1  0  0  0  1  1  0  0  1 
 18  0  1  0  0  0  1  0  0  0  0  0  0  0  0  0  0  0  0  1  1 
 19  0  1  0  0  1  0  1  0  0  0  0  0  0  0  1  0  0  0  0  0 
 20  0  0  0  0  0  0  1  0  1  0  0  0  1  0  0  0  1  1  1  0 
Введите ряд в которох нужно купить билеты:8
Введите колличество мест:15
В данном ряду не хватает свободных мест

Введите колличество рядов:5
Введите колличество мест в ряду:5
В кинотеатре 5 рядов по 5  мест в каждом
     1  2  3  4  5 
  1  0  0  0  0  0 
  2  1  1  1  0  0 
  3  0  1  1  0  0 
  4  1  0  1  0  0 
  5  0  1  0  0  0 
Введите ряд в которох нужно купить билеты:5
Введите колличество мест:3
Вы можете купить места с 3 по 5 в 5 ряду.

*/