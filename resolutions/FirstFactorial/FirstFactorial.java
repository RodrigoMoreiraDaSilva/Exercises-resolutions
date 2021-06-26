import java.util.*;
import java.io.*;

class Main {

  public static int FirstFactorial(int num) {
    for(int index = num; index != 1; index--) {
      num = num * (index - 1);
    }

    return num;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);

    System.out.print(FirstFactorial(s.nextLine()));
  }
}