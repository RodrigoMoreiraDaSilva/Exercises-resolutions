import java.util.*; 
import java.io.*;

class Main {

  public static String FindIntersection(String[] strArr) {
    // code goes here  

    String arrayOne[] = strArr[0].split(", ");
    String arrayTwo[] = strArr[1].split(", ");

    String result = "";

    for(int index = 0; index < arrayOne.length; index++) {
      for(int indexTwo = 0; indexTwo < arrayTwo.length; indexTwo++) {
        if(arrayOne[index].equals(arrayTwo[indexTwo])) {
          if(result.isEmpty())
            result = arrayOne[index];
          else 
            result = result + "," + arrayOne[index];
        } 
      }
    }

    return result.isEmpty() ? "false" : result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }
}