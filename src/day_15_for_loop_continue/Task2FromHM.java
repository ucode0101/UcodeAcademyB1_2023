package day_15_for_loop_continue;

import java.util.Scanner;

public class Task2FromHM {
    public static void main(String[] args) {
        //Task 2:
        //Write a program to ask user to enter a number from 50 to 100 and print even numbers from 1 to given number:
        //example: if user enters 60 print even numbers from 1 to 60

        System.out.println("Enter a number from 50 to 100");

        int sumOfEvens=0;
        int num =0;

        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()){
            num = input.nextInt();
        }
        else {
            System.out.println("Please enter a valid number");
        }

        for (int i =1; i<=num; i++){

               if (i % 2 ==0){
                   sumOfEvens += i;
                   System.out.print(i+" ");
               }

        }
        System.out.println();
        System.out.println("sum of all even numbers from 1 to "+num);
        System.out.println(sumOfEvens);



    }
}
