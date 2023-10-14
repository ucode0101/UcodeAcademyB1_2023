package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopBreakAndContinue {
    public static void main(String[] args) {
        // Write a program to ask user to enter a string and print vowels only
        // if you find 'y' break from the loop
        // if  char is 'w' continue

        String vowels ="aeiou";

        System.out.println("Enter a string please");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        for (int i=0; i< str.length(); i++){

            if (str.charAt(i) == 'a'){
                continue;
            }



           else if (str.charAt(i) == 'y'){
                System.out.println("Found 'y' I am existing the loop");
                break;
            }
            else if (vowels.contains(""+str.charAt(i))){

                System.out.println(str.charAt(i));
            }

        }
    }
}
