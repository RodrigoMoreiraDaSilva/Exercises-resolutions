import java.util.*; 
import java.io.*;
import java.lang.StringBuilder; 

class Main {

  public static String FirstReverse(String str) {
    // code goes here
    str = new StringBuilder(str).reverse().toString();

    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }
}