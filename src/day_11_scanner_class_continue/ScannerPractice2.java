package day_11_scanner_class_continue;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        // Write a program to ask user to enter first name, last name, and age
        // Validate/check that the user enters a valid number for age(otherwise you will get an error)
        // print them

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();// it takes the input as a string (a single word) until the space

        System.out.println("Enter your last name");
        String lastName = scan.next();

        System.out.println("Enter your age");
        int age =0; // Declare and initialize it here, so we can access it when we want to print

        if (scan.hasNextInt()){

             age = scan.nextInt();
        }
        else {
            System.out.println("Please enter a valid number for age");

        }
        System.out.println(firstName+" "+lastName+" "+age);



    }
}
