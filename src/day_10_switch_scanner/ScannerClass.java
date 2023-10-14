package day_10_switch_scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        // Creating variable/object from Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt/display some message so the user can see
        System.out.println("Please enter a number");

        byte b = input.nextByte();

        System.out.println("You entered: "+b);




    }
}
