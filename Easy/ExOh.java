import java.util.Scanner;

public class ExOh {

  public static String ExOhh(String str) {
    // code goes here 
    int xCount = 0, oCount = 0;

    for (char c : str.toCharArray()) {
      if (c == 'x' || c == 'X') {
        xCount++;
      } else if (c == 'o' || c == 'O') {
        oCount++;
      }
    }
    return xCount == oCount ? "true" : "false";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ExOhh(s.nextLine())); 
  }

}