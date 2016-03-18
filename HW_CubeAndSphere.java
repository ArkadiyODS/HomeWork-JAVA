/*
 13.	Заполнить трёхмерный массив N x N x N нулями. В получившийся куб вписать
шар, состоящий из единиц. После чего, разрезать куб на N слоёв, и показать каждый
слой в виде двумерного массива N x N на экране консоли.
 */
package hw_cubeandsphere;
  
public class HW_CubeAndSphere {
    public static void main(String[] args) {  
        int size = 13,
            r = (int)size/2,
            x0 = r,
            y0 = r;        
        int [][][] arr = new int[size][size][size];
        for (int z = 0, R = 0; z < arr.length; z++) {
            for (int i = x0-R; i <= x0+R; i++) {
                 arr[z][i][y0 + yFinder(i - x0,R)] = 1;
                 arr[z][i][y0 - yFinder(i - x0,R)] = 1;
            } 
        if(z < r)
                R++;
            else
                R--;
        }
        for (int z = 0; z < arr.length; z++) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[z][i][j]);
                }
                System.out.println();
            }
           System.out.println();
        }
    }
    public static int yFinder(int x, int R) { 
        return (int)Math.sqrt(Math.pow(R, 2) - Math.pow(x, 2)); 
    }
/* 
0000000000000
0000000000000
0000000000000
0000000000000
0000000000000
0000000000000
0000001000000
0000000000000
0000000000000
0000000000000
0000000000000
0000000000000
0000000000000

0000000000000
0000000000000
0000000000000
0000000000000
0000000000000
0000001000000
0000010100000
0000001000000
0000000000000
0000000000000
0000000000000
0000000000000
0000000000000

0000000000000
0000000000000
0000000000000
0000000000000
0000001000000
0000010100000
0000100010000
0000010100000
0000001000000
0000000000000
0000000000000
0000000000000
0000000000000

0000000000000
0000000000000
0000000000000
0000001000000
0000100010000
0000100010000
0001000001000
0000100010000
0000100010000
0000001000000
0000000000000
0000000000000
0000000000000

0000000000000
0000000000000
0000001000000
0000100010000
0001000001000
0001000001000
0010000000100
0001000001000
0001000001000
0000100010000
0000001000000
0000000000000
0000000000000

0000000000000
0000001000000
0001000001000
0010000000100
0010000000100
0010000000100
0100000000010
0010000000100
0010000000100
0010000000100
0001000001000
0000001000000
0000000000000

0000001000000
0001000001000
0010000000100
0100000000010
0100000000010
0100000000010
1000000000001
0100000000010
0100000000010
0100000000010
0010000000100
0001000001000
0000001000000

0000000000000
0000001000000
0001000001000
0010000000100
0010000000100
0010000000100
0100000000010
0010000000100
0010000000100
0010000000100
0001000001000
0000001000000
0000000000000

0000000000000
0000000000000
0000001000000
0000100010000
0001000001000
0001000001000
0010000000100
0001000001000
0001000001000
0000100010000
0000001000000
0000000000000
0000000000000

0000000000000
0000000000000
0000000000000
0000001000000
0000100010000
0000100010000
0001000001000
0000100010000
0000100010000
0000001000000
0000000000000
0000000000000
0000000000000

0000000000000
0000000000000
0000000000000
0000000000000
0000001000000
0000010100000
0000100010000
0000010100000
0000001000000
0000000000000
0000000000000
0000000000000
0000000000000

0000000000000
0000000000000
0000000000000
0000000000000
0000000000000
0000001000000
0000010100000
0000001000000
0000000000000
0000000000000
0000000000000
0000000000000
0000000000000

0000000000000
0000000000000
0000000000000
0000000000000
0000000000000
0000000000000
0000001000000
0000000000000
0000000000000
0000000000000
0000000000000
0000000000000
0000000000000
*/ 
}