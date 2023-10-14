package day_12_string_class;

import java.util.Scanner;

public class StringMethodsWithScanner3 {
    public static void main(String[] args) {

        // write a program to take 2 strings from user and check if they are equal
        // first check with equals and with equalsIgnoreCase

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string");

        String str1 = scan.nextLine();

        System.out.println("Enter second string");

        String str2 = scan.nextLine();

        boolean b1 = str1.equals(str2);
        boolean b2 = str1.equalsIgnoreCase(str2);

        System.out.println("Equals "+b1);
        System.out.println("equalsIgnoreCase "+b2);


    }
}
