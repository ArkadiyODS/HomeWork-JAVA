package Numbers;
   
public class Five extends Number {
    
    public Five(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format("  %1$c%1$c%1$c%1$c ", sign),
        String.format(" %1$c     ", sign),
        String.format("%1$c%1$c%1$c%1$c%1$c  ", sign),
        String.format("     %1$c ", sign),
        String.format("     %1$c ", sign),
        String.format("%1$c    %1$c ", sign),
        String.format(" %1$c%1$c%1$c%1$c  ", sign) 
    };
    } 
}
