package day_17_while_do_while_loops;

import java.util.Scanner;

public class WhileDoWhileLoop7 {

    public static void main(String[] args) {

        // Task:
        // Write a program to get input from user from 1 to 7
        // and print day of the for the given number
        // example -> 1 Mon, 2 Tues

        // For homework:
        // Validate that it is a valid number, and it is from 1 to 7
        // make sure it has a number


        int dayOfWeek =0;

        System.out.println("Please enter from 1 to 7");

        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()){ // Make sure it is a number
            dayOfWeek = scan.nextInt();
        }





            while ( (dayOfWeek >=1 && dayOfWeek <=7)){ // make sure it is from 1 to 7

                switch (dayOfWeek){
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tue");
                        break;
                    case 3:
                        System.out.println("Wed");
                        break;
                    case 4:
                        System.out.println("Thu");
                        break;
                    case 5:
                        System.out.println("Fri");
                        break;
                    case 6:
                        System.out.println("Sat");
                        break;
                    default:
                        System.out.println("Sun");
                }
                break;



            }




    }
}
