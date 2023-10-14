package day_15_for_loop_continue;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        // Palindrome is the string thar the same in reverse order
        // example: civic

        String str = "";
        String palindrome ="";

        System.out.println("Please enter a word");
        Scanner scan  = new Scanner(System.in);

        str = scan.nextLine();

        for (int i= str.length()-1; i>=0; i--){
            palindrome +=str.charAt(i);
        }

        if (str.equalsIgnoreCase(palindrome)){
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("It is not Palindrome");
        }



    }
}
