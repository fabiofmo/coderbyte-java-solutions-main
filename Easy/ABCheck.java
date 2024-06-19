import java.util.*; 
import java.io.*;

public class ABCheck {

  public static String ABCheckk(String str) {
    // code goes here
    char[] chars = str.toCharArray();
    for(int i =0; i<chars.length;i++){
      if(chars[i]=='a' && (i+4)<chars.length && chars[i+4]=='b' ){
        return "true";
      }else if(chars[i]=='b' && (i+4)<chars.length && chars[i+4]=='a' ){
                return "true";
      }
    }
    return "false";
  }

  public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print(ABCheckk(s.nextLine()));	 
  }

}
