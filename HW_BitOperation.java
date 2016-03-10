/*
 9. Есть переменная типа int (32 бита), равная нулю. Присвоить трём случайным 
    битам значение 1. Показать получившееся значение переменной.
 */
package hw_bitoperation;

public class HW_BitOperation {

    public static void main(String[] args) {
        int  x = 0;    
        char[] array = String.format("%16s", Integer.toBinaryString(x)).replace(' ', '0').toCharArray();
        
        System.out.println(String.valueOf(array));    
        for (int i = 0; i < 3; i++) {
            array[(int)(Math.random()*16)]='1';
        }    
        System.out.println(String.valueOf(array));
        System.out.println(Integer.parseInt(String.valueOf(array), 2));
    }  
}
/*
0000000000000000
0101001000000000
20992
*/