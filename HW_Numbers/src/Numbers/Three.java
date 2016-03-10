package Numbers;
   
public class Three extends Number {
    
    public Three(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format("  %1$c%1$c%1$c  ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format("     %1$c ", sign),
        String.format("   %1$c%1$c  ", sign),
        String.format("     %1$c ", sign),
        String.format(" %1$c   %1$c ", sign),
        String.format("  %1$c%1$c%1$c  ", sign) 
    };
    } 
}
