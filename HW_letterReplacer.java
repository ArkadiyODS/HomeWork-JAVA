/*
12. Напишите программу, которая выведет на экран все возможные варианты 
перестановки символов в исходной строке. Избежать повторения при перестановках. 
Примерами перестановок символов строки «AAB» могут быть «AAB», «ABA» и «BAA».
 */
package hw_letterreplacer; 

public class HW_letterReplacer {
  
     
  public static void main(String[] args) { 
      String s = "aebaebcabe"; 
      s = UniqLettersString(s,"",0);
      System.out.println(s);
      permuteString("", s);
  }

  public static String UniqLettersString(String s, String tempString, int index) {  
      if(s.length() > 0) { 
        tempString+= s.charAt(0);
        String [] sArray = s.split(Character.toString(s.charAt(0)));
        s = "";
        for (int i = 0; i < sArray.length; i++) {
           s += sArray[i];
        }  
        tempString = UniqLettersString(s, tempString, index++);
      }
      return tempString;
  }
  
  public static void permuteString(String beginningString, String endingString) {
    if (endingString.length() <= 1)
      System.out.println(beginningString + endingString);
    else
      for (int i = 0; i < endingString.length(); i++) {
        try {
          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

          permuteString(beginningString + endingString.charAt(i), newString);
        } catch (StringIndexOutOfBoundsException exception) {
          exception.printStackTrace();
        }
      }
  }
  
  
}