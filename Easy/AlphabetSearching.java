import java.util.Scanner;

public class AlphabetSearching {

  public static String StringChallengee(String str) {
    // code goes here  
    boolean lever =true;
    //char[] charStr = str.toCharArray();
    
    

    for(char letter='a';letter<='z';letter++){
      String strLetter = String.valueOf(letter);
      if(str.contains(strLetter)){
        lever = true;
      }else{
        lever=false;
      }
      
    }

    String output=Boolean.toString(lever);
    return output;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallengee(s.nextLine())); 
  }


}