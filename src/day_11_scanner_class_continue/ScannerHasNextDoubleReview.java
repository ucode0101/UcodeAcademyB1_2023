package day_11_scanner_class_continue;

import java.util.Scanner;

public class ScannerHasNextDoubleReview {

    public static void main(String[] args) {
        // Task 2:
        // Write a program to take the input from user (double) and verify it is a valid double

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number with decimal");

        if (scan.hasNextDouble()){
            System.out.println(scan.nextDouble());
        }
        else {
            System.out.println("Please enter number with decimal");
        }
    }
}
