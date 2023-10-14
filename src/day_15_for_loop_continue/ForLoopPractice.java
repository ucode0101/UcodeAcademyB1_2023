package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        // Task:
        // Write a program to ask user to enter a string/sentence and remove all duplicate character
        // example -> java -> jav; selenium ->

        String str ="";
        String uniques = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word or sentence");

        str = scan.nextLine();

        // First way
        for(int i =0; i<= str.length()-1; i++){

            if (!uniques.contains(""+str.charAt(i))){
                uniques +=""+ str.charAt(i);
            }
            else {
                continue;
            }
        }
        System.out.println("First WayL\n"+uniques);

        String uniques2 ="";
        System.out.println("=======================");

        for (int i=0; i< str.length(); i++){

            if (uniques2.contains(""+str.charAt(i))){
                continue;
            } else {
                uniques2 +=""+str.charAt(i);
            }

        }
        System.out.println("Second way\n"+uniques2);

    }
}
