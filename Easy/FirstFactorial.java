import java.util.Scanner;

public class FirstFactorial {

  public static int FirstFactoriall(int num) {
    if (num == 1) {
      return 1;
    }
    return num * FirstFactoriall(num - 1);
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactoriall(Integer.valueOf(s.nextLine()))); 
  }
}