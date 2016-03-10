package Numbers;
   
public class Nine extends Number {
    
    public Nine(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format(" %1$c%1$c%1$c   ", sign),
        String.format("%1$c   %1$c%1$c ", sign),
        String.format("%1$c   %1$c%1$c", sign),
        String.format(" %1$c%1$c%1$c %1$c ", sign),
        String.format("     %1$c ", sign),
        String.format("    %1$c  ", sign),
        String.format(" %1$c%1$c%1$c   ", sign) 
    };
    } 
}
