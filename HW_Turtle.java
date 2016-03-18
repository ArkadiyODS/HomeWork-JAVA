/*
 15. Черепашка.
На квадратной доске размером NxN расставлены случайные целые положительные числа.
Черепашка, находящаяся в левом верхнем углу, мечтает попасть в правый нижний.
При этом она может переползать только в клетку справа или снизу (не наискосок) и
хочет, чтобы сумма всех чисел, оказавшихся у неё на пути, была максимально возможной.
Показать на экране консоли эту сумму. Также, программа должна показать путь следования черепашки.
 */
package hw_turtle; 

import java.util.Random;

public class HW_Turtle { 
    public static void main(String[] args) {
         int size = 4;
         int[][] board = new int[size][size]; 
         int[][] path = new int[size][size]; 
         Randomiser(board);
         System.out.println("Field");
         Show(board);
         Path(0,0,board,path);
         System.out.println("\nPath");
         Show(path);
         System.out.println();
         Move(0,0,path);
    }
    
    private static int Path(int x, int y, int[][] board, int[][] path) {         
        int right = 0, down = 0, result;        
        if (x < board.length-1)
          right = Path(x + 1, y, board, path);        
        if (y < board[0].length-1)
          down = Path(x, y + 1, board, path);
        result = (right > down)? right : down;
        return path[x][y] = board[x][y] + result;        
    }
    
     private static void Move(int x, int y, int[][] arr) {         
        int right = 0, down = 0, result; 
         System.out.print("Start move");
        do{ 
            System.out.print(" -> ");
            right = 0; 
            down = 0;
            if(x < arr.length-1) {
                down = arr[x+1][y];
            }
            if (y < arr[0].length-1) {
                right = arr[x][y+1];
            }
            if(right > down) {
                System.out.print("right");
                y++;
            }
            else {
                System.out.print("down");
                x++;
            }
        }while(x < arr.length - 1 || y < arr[0].length - 1);
         System.out.println();
    }
    
    private static void Randomiser(int[][] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int)(r.nextFloat()*10);
            }
        } 
    }
    
    private static void Show(int[][] arr) {   
        System.out.println();
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    } 
}

/*
Field

 3  1  9  2 
 9  0  8  9 
 9  9  0  4 
 3  5  8  3 

Path

46 34 33 18 
43 25 24 16 
34 25 11  7 
19 16 11  3 

Start move -> down -> down -> right -> down -> right -> right
*/