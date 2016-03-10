package Numbers;
 
public abstract class Number {
    
    protected char sign; 
    protected String[] graphicArray;
    
    public void PrintLevel(int level)
    {
        System.out.print(graphicArray[level]); 
    }
}
