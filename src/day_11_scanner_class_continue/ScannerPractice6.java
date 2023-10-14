package day_11_scanner_class_continue;

import java.util.Scanner;

public class ScannerPractice6 {

    public static void main(String[] args) {

        // Write a program to ask user to enter a number from 65 to 90 or 97 to 122
        // Find out if it is a lower case letter or upper case

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number from 65 to 90 or 97 to 122");

        int num =0;


        if (input.hasNextInt()){
            num = input.nextInt();

            if (num >=65 && num <=90){
                System.out.println("You entered upper case character");
            }
            else if (num >=97 && num <= 122){
                System.out.println("You entered lower case character ");
            } else {
                System.out.println("You did not enter a number matching any char in ASCII");
            }
        } else {
            System.out.println("Please enter number only");
        }



    }
}
