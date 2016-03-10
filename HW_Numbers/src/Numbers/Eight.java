package Numbers;
   
public class Eight extends Number {
    
    public Eight(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format("  %1$c%1$c%1$c  ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format("  %1$c%1$c%1$c  ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format("  %1$c%1$c%1$c  ", sign) 
    };
    } 
}
