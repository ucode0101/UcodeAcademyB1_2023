package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopAndSwitchStatement {
    public static void main(String[] args) {
        // Write a program to ask user to enter a string/sentence and check how many times 'abc' appears
        // example: javabcjavabc => 2

        String str ="";
        System.out.println("Please enter a string/sentence");

        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();

        int countOfAbc =0;

        for (int i=0; i< str.length()-2; i++){
            String s = str.substring(i,i+3); //

            if (s.equalsIgnoreCase("abc")){
                countOfAbc ++;
            }

        }
        System.out.println("count of abc: "+countOfAbc);



    }
}
