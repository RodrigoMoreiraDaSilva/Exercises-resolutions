import java.util.*; 
import java.io.*;
import java.lang.Iterable;

class Main {

  public static String LongestWord(String input) {
    // code goes here
    String[] words = input.split(" ");
    String longestWord = "";
    
    for(String word : words) {
      String wordClear = "";

      for(int index = 0; index < word.length(); index++) {
        	if(Character.isLetter(word.charAt(index)) || Character.isDigit(word.charAt(index))) {
	          wordClear = wordClear + word.charAt(index);
	        }
      }

      if(wordClear.length() > longestWord.length()) 
        longestWord = wordClear;
    }

    return longestWord;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }
}