import java.util.Scanner;

public class ConsonantCount {
    public static int ConsonantCounts(String str) {
    	
        int result = 0;
        String vowels = "aeiuoAEIUO";
        
        for (int i = 0; i < str.length(); i++) {
            if (!vowels.contains(Character.toString(str.charAt(i))) && Character.isLetter(str.charAt(i))) {
                result = result + 1;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ConsonantCounts(s.nextLine())); 
    }
}

