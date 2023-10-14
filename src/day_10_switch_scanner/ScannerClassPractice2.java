package day_10_switch_scanner;

import java.util.Scanner;

public class ScannerClassPractice2 {
    public static void main(String[] args) {

        // Task 2:
        // Write a program to ask the user to enter 3 number
        // return sum of all number

        // Assume the user enters only number

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number ");
        double d1 = input.nextDouble();

        System.out.println("Please enter your second number");

        double d2 = input.nextDouble();

        System.out.println("Please enter you third number");

        double d3 = input.nextDouble();

        double sum = d1+d2+d3;

        System.out.println("Sum of all your numbers are: "+sum);

        // Closing scanner
        input.close();

        System.out.println("===========================================");





    }
}
