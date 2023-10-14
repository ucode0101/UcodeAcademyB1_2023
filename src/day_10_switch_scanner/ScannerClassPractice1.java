package day_10_switch_scanner;

import java.util.Scanner;

public class ScannerClassPractice1 {

    public static void main(String[] args) {
        // Task 2:
        // Write a java program to the input(num) from the user
        // and check if the number is even or odd
        // Note user scanner and if else statement

        // Creating/declaring object/variable
        Scanner scan = new Scanner(System.in);

        // Prompt/display some message so the user can see
        System.out.println("Please enter a number");

        // assign user's input to in variable
        int num = scan.nextInt();

        // checking if the number is even or odd
        if (num % 2 ==0){
            System.out.println("You entered even number: "+num);
        }
        else {
            System.out.println("You entered odd number: "+num);
        }

        scan.close(); // it closes the scanner/after this line scanner does not take any input





    }
}
