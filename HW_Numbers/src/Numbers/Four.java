package Numbers;
   
public class Four extends Number {
    
    public Four(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format("   %c   ", sign),
        String.format("  %1$c%1$c   ", sign),
        String.format(" %1$c %1$c   ", sign),
        String.format("%1$c  %1$c   ", sign),
        String.format("%1$c%1$c%1$c%1$c%1$c%1$c ", sign),
        String.format("   %1$c   ", sign),
        String.format("   %1$c   ", sign) 
    };
    } 
}
