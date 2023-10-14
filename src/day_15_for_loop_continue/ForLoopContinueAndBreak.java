package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopContinueAndBreak {
    public static void main(String[] args) {
        // Write a program to ask user to enter and string and print all chars
        // except vowels (aeiou)

        String str ="";
        String vowels ="aeiou";
        System.out.println("Enter a string ");
        Scanner scan = new Scanner(System.in);

        str = scan.nextLine();

        for (int i=0; i< str.length(); i++){
            if (vowels.contains(""+str.charAt(i))){
                continue;
            }
            else if (str.charAt(i) == 'x'){
                break;
            }
            else {
                System.out.println(str.charAt(i));
            }

        }
    }
}
