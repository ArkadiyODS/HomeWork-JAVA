package Numbers;
   
public class Seven extends Number {
    
    public Seven(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format("%1$c%1$c%1$c%1$c%1$c%1$c ", sign),
        String.format("     %1$c ", sign),
        String.format("    %1$c  ", sign),
        String.format("   %1$c   ", sign),
        String.format("  %1$c    ", sign),
        String.format(" %1$c     ", sign),
        String.format("%1$c      ", sign) 
    };
    } 
}
