import java.util.*; 
import java.io.*;

class Main {

  public static String CodelandUsernameValidation(String str) {
    // code goes here
    return String.valueOf((
        str.length() > 4 
        && str.length() < 25
        && str.matches("^[A-Za-z]\\w+[A-Za-z0-9]$")
    ));
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }
}