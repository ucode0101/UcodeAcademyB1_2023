package day_17_while_do_while_loops;

import java.util.Scanner;

public class WhileLoopBreakContinue {

    public static void main(String[] args) {

        // Task:
        // Write a program to ask user to enter a word/sentence print each char
        // one by one not including a b and c
        // if a char is y break from the loop

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a word/sentence");

        String str = input.nextLine();

        int i=0;


        while (i <str.length()){


            if (str.charAt(i)== 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c'){
               i++; // my logical error was here


                continue; // skips the current iteration
            }
            else if (str.charAt(i) == 'y'){
                break;
            }
            else {
                System.out.print(str.charAt(i));
            }
            i++;


        }

    }
}
