package Numbers;
   
public class One extends Number {
    
    public One(char s){
       sign = s; 
       graphicArray = new String[ ]{
        String.format("   %c   ", sign),
        String.format("  %1$c%1$c   ", sign),
        String.format("   %c   ", sign),
        String.format("   %c   ", sign),
        String.format("   %c   ", sign),
        String.format("   %c   ", sign),
        String.format(" %1$c%1$c%1$c%1$c%1$c ", sign) 
    };
    } 
}
