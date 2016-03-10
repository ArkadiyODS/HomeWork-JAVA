package Numbers;
   
public class Six extends Number {
    
    public Six(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format("   %1$c%1$c%1$c ", sign),
        String.format("  %1$c    ", sign),
        String.format(" %1$c     ", sign),
        String.format("%1$c %1$c%1$c   ", sign),
        String.format("%1$c%1$c  %1$c  ", sign),
        String.format("%1$c   %1$c  ", sign),
        String.format(" %1$c%1$c%1$c   ", sign) 
    };
    } 
}
