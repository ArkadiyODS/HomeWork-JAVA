package Numbers;
   
public class Two extends Number {
    
    public Two(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format(" %1$c%1$c%1$c   ", sign),
        String.format("%1$c   %1$c  ", sign),
        String.format("%1$c   %1$c  ", sign),
        String.format("   %1$c   ", sign),
        String.format("  %1$c    ", sign),
        String.format(" %1$c     ", sign),
        String.format("%1$c%1$c%1$c%1$c%1$c%1$c ", sign) 
    };
    } 
}
