package day_17_while_do_while_loops;

import java.util.Scanner;

public class WhileDoWhileLoop5 {
    public static void main(String[] args) {


        // Task 1:
        // Write a program to ask user to enter a string and remove duplicates using while loop
        // example -> java => jav

        System.out.println("please enter a word/sentence");

        Scanner scan = new Scanner(System.in);

        String str ="";

        str = scan.nextLine();

        String result ="";

//        for (int j =0; j<str.length(); j++){
//
//            if (!str.contains(""+str.charAt(j))){
//                result += str.charAt(j);
//            }
//
//        }

        int i =0;


        while ( i <str.length()){

            if (!result.contains(""+str.charAt(i))){
                result +=""+str.charAt(i);
            }
            i++;

        }
        System.out.println("Printing result without duplicates");

        System.out.println(result);

        System.out.println("=======================================");

        String result2 ="";
        int n =0;

        do {
            if (!result2.contains(""+str.charAt(n))){
                result2 +=str.charAt(n);
            }
            n++;
        } while (n < str.length());

        System.out.println("Printing result 2 with do while loop");

        System.out.println(result2);




    }
}
