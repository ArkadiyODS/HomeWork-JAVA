package Numbers;
   
public class Zero extends Number {
    
    public Zero(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format("  %1$c%1$c%1$c  ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format("  %1$c%1$c%1$c  ", sign) 
    };
    } 
}
