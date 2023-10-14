package day_11_scanner_class_continue;

import java.util.Scanner;

public class ScannerPractice1 {

    public static void main(String[] args) {

        // Task 1:
        // Write a program to takes 4 numbers from user and return the average number;
        // User Scanner. Assume the user enters number only

        int num = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter your first number");
        num += scan.nextInt();
        System.out.println("enter second number");

        num += scan.nextInt();
        System.out.println("enter third number");

        num+= scan.nextInt();
        System.out.println("enter fourth number");

        num += scan.nextInt();

        System.out.println("The average number is: "+(num/4));

    }
}
