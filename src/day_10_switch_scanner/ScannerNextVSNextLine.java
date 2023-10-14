package day_10_switch_scanner;

import java.util.Scanner;

public class ScannerNextVSNextLine {
    public static void main(String[] args) {
        // Write a program to take input from the user
        // first,last name, address, martialStatus
        // Use scanner class

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, please enter your first name");
        String firstName = input.nextLine(); // next() only takes a word until the space

        //input.nextLine(); // getting whatever next() is holding

        System.out.println(firstName+", enter your last name ");

         String lastName = input.next(); // nextLine() takes everything that is entered by user

        System.out.println(firstName+" "+lastName);


    }
}
