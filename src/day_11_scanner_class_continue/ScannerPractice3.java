package day_11_scanner_class_continue;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        // Every letter/char is represented by a number in ASCII table, 97 to 122 represent lower case a-z
        // Write a program to ask user to enter a number from 97 to 122, and convert this number to char
        //


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number from 97 to 122");

        int num =0;
        char ch =' ';
        if (scan.hasNextInt()){  // First we check if the input is number
           num = scan.nextInt();

           if (num >=97 && num <=122){ // Second we check if the number is in the range
               ch = (char) num; // explicit casting int to char
           }
           else {
               System.out.println("The number is not in the range");
           }
        }
        else {
            System.out.println("Please enter a number");
        }
        System.out.println(ch);

    }
}
