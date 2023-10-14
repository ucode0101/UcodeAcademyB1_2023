package day_10_switch_scanner;

import java.util.Scanner;

public class ScannerClassPractice4 {
    public static void main(String[] args) {

        // Write a program to take input from the user
        // first,last name, address, martialStatus
        // Use scanner class

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, please enter your first name");
        String firstName = scan.nextLine(); // for now use nextLine() to avoid confusion

        System.out.println(firstName +", enter your last name");
        String lastName = scan.nextLine();

        System.out.println(firstName +" "+ lastName+" enter your martial statue (true/false)");
        boolean isMarried = scan.nextBoolean();

        System.out.println("First name: "+firstName+"\nLast name: "+ lastName+"\nMarried?: "+ isMarried);

    }
}
