import java.util.*; 
import java.io.*;

class Main {

  public static String BracketMatcher(String text) {
    // code goes here
    int initBrackets = 0, endBrackets = 0;

    for(int index = 0; index < text.length(); index++) {
      String character = Character.toString(text.charAt(index));

      if(character.equals("("))
        initBrackets++;
      else if(character.contains(")"))
        endBrackets++;
    }

    return initBrackets == endBrackets ? "1" : "0";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketMatcher(s.nextLine())); 
  }
}