/*
23.	Дана последовательность: 1, 11, 21, 1211, 111221, 312211, 13112221, …
Ввести число N. Показать N-ный по счёту элемент последовательности.
 */
package hw_conwaysequence;

import java.util.Scanner;

public class HW_ConwaySequence {
    
  //  private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        int number;
        String s = "1";
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Please enter number: ");
        number = sc.nextInt(); 
        
            System.out.println(s);
        for (int i = 0; i < number; i++) { 
            s = SequenceBuilder(s); 
            System.out.println(s);
        }  
    }
    
    private static String SequenceBuilder(String prevSeq){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char temp = prevSeq.charAt(0);
        for (int i = 0; i < prevSeq.length(); i++) {
            if(temp == prevSeq.charAt(i))
                count++;
            else {
                sb.append(count);
                sb.append(temp);
                count = 1;
                temp = prevSeq.charAt(i);
            } 
        }
        sb.append(count);
        sb.append(temp);
        
        return sb.toString();
    } 
}
/*
Please enter number: 15
1
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211
11131221133112132113212221
3113112221232112111312211312113211
1321132132111213122112311311222113111221131221
11131221131211131231121113112221121321132132211331222113112211
311311222113111231131112132112311321322112111312211312111322212311322113212221
132113213221133112132113311211131221121321131211132221123113112221131112311332111213211322211312113211 
*/ 