package day_10_switch_scanner;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {

        // declare a variable and take 3 numbers from user and sum them


        Scanner scan = new Scanner(System.in);

        int total = 0;

        System.out.println("Please enter a number");
        total += scan.nextInt();

        System.out.println("enter another number");
        total += scan.nextInt();

        System.out.println("enter last number");
        total += scan.nextInt();

        System.out.println("Sum of all your numbers: "+ total);

        //scan.close(); // it was causing the exception/error because we were closing the Scanner, and tried to use it agian

        System.out.println("============================");

        String fullName ="";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first Name");
        fullName +=input.nextLine();

        System.out.println("Enter your last name");

        fullName +=" "+input.nextLine();

        System.out.println("Your full name: "+fullName);





    }
}
