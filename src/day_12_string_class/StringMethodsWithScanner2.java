package day_12_string_class;

import java.util.Scanner;

public class StringMethodsWithScanner2 {
    public static void main(String[] args) {

        // Task:
        // Write a program to ask user to enter a string
        // and print the middle character


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter any string");

        String str = scan.nextLine();

        int n = str.length()/2;

        char ch = str.charAt(n);

        System.out.println(ch);
    }
}
