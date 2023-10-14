package day_10_switch_scanner;

import java.util.Scanner;

public class ScannerClassPractice3 {
    public static void main(String[] args) {

        // Task 4:
        // Write a program that takes 3 numbers from the user and returns max/largest number
        // Use scanner and if else statement. Assume all numbers are different
        // Assume all numbers are valid number

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter your first number");
        int num1 = scan.nextInt();

        System.out.println("Please Enter your second number");
        int num2 = scan.nextInt();

        System.out.println("Please Enter your third number");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("The max number is: "+num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("The max number is: "+num2);
        }
        else {
            System.out.println("The max number is: "+ num3);
        }


    }
}
