package day_15_for_loop_continue;

import java.util.Scanner;

public class StringEqualNotEqualsReview {

    public static void main(String[] args) {

        // Task:
        // Write a program to check if given string contains "a"
        // Write a program to check if given string does Not contain "b"

        String str = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");

        str = scan.nextLine();

        if (str.contains("a")){
            System.out.println("String contains 'a'");
        } else {
            System.out.println("String does not contain 'a'");
        }
        System.out.println("==================================================");

        if (!str.contains("b")){
            System.out.println("String does not contain 'b'");
        } else {
            System.out.println("String contains 'b'");
        }

        System.out.println("===============================");
        System.out.println(str.contains("a"));
        System.out.println(!str.contains("a"));

    }
}
