/*
 * 9.	Вывести на экран каркас параллелепипеда размерностью AxBxC.
 */
package hw_parallelepiped;
 
import java.util.*;

public class HW_Parallelepiped { 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height, width, length;
        System.out.printf("Enter height: ");  
        height = sc.nextInt();
        System.out.printf("Enter width: ");  
         width = sc.nextInt();
        System.out.printf("Enter length: ");  
         length = sc.nextInt(); 
 
    for(int i = 0; i < width/2; i++) // верхняя линия
        System.out.printf(" ");
    for(int i = 0; i < length; i++)
        System.out.printf("*");
 
    for(int i = 1; i < width/2; i++)
    {
        System.out.println();
        for(int j = 0; j < width/2 - i; j++)    // ширина
            System.out.printf(" ");
        System.out.printf("*");
        for(int j = 1; j < i; j++)      // высота
            System.out.printf(" ");
        System.out.printf("*");
        for(int j = 1; j < length/2; j++)   // пустота
            System.out.printf(" ");
        for(int j = 0; j < length/2 - i; j++)   // ширина
            System.out.printf(" ");
        System.out.printf("*");
        for(int j = 1; j < i; j++)      // высота
            System.out.printf(" ");
        System.out.printf("*");
    }
    System.out.println();
    for(int i = 0; i < length; i++) // средняя линия
        System.out.printf("*");
    for(int i = 1; i < width/2; i++)    // дорисовываем точку высоты
        System.out.printf(" ");
    System.out.printf("*");
 
    for(int i = 2; i < height/2; i++)
    {
        System.out.println();
        System.out.printf("*");   // высота
        for(int j = 1; j < width/2; j++)    // высота
            System.out.printf(" ");
        System.out.printf("*");
        for(int j = 2; j < length - width/2; j++)   // высота
            System.out.printf(" ");
        System.out.printf("*");
        for(int j = 1; j < width/2; j++)    // высота
            System.out.printf(" ");
        System.out.printf("*");
    }
 
    System.out.println();
    System.out.printf("*");
    for(int i = 1; i < width/2; i++)
        System.out.printf(" ");
    for(int i = 0; i < length; i++) // нижняя линия
        System.out.printf("*");
 
    for(int i = 0; i < width/2 - 1; i++)
    {
        System.out.println();
        System.out.printf("*");   // высота
        for(int j = 2; j < width/2 - i; j++)    // ширина
            System.out.printf(" ");
        System.out.printf("*");
        for(int j = 1; j < length - width/2 + i; j++)   // пустота
            System.out.printf(" ");
        System.out.printf("*");
        for(int j = 2; j < width/2 - i; j++)   // ширина
            System.out.printf(" ");
        System.out.printf("*");
    }
    System.out.println();
    for(int i = 0; i < length; i++) // нижняя нижняя линия
        System.out.printf("*"); 
    System.out.println();
    } 
}
/*
Enter height: 10
Enter width: 10
Enter length: 15
     ***************
    **            **
   * *           * *
  *  *          *  *
 *   *         *   *
***************    *
*    *        *    *
*    *        *    *
*    *        *    *
*    ***************
*   *         *   *
*  *          *  *
* *           * *
**            **
***************
*/
