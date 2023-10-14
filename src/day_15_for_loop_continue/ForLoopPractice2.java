package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {
        // Write a program to ask user to enter a string/sentence and reverse it

        String reverse ="";
        String str ="";

        System.out.println("Enter a string/sentence");

        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();




        for (int i = str.length()-1; i>=0; i--){

            reverse +=""+str.charAt(i);

        }
        System.out.println("Reversed String:");
        System.out.println(reverse);
    }
}
