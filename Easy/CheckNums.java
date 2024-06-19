import java.util.*;
import java.io.*;

public class CheckNums {

    public static String CheckNumss(int num1, int num2) {

        if (num2 > num1) 
           return "true";
        else if (num2 < num1)
           return "false";
        else 
           return "-1";
    }
    
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CheckNumss(s.nextLine())); 
    }
}

