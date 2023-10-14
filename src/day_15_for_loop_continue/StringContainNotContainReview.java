package day_15_for_loop_continue;

import java.util.Scanner;

public class StringContainNotContainReview {

    public static void main(String[] args) {

        // Warm up task;
        // Write a program that asks user to enter two string and check if they equal

        String str1 ="";
        String str2 ="";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first string");

        str1 = scan.nextLine();
        System.out.println("Please enter second string");

        str2 = scan.nextLine();

        if (!str2.equals(str1)){
            System.out.println("Both string are NOT equal/same");
        } else {
            System.out.println("Both strings are  equal/same");
        }

        System.out.println("========================");

        System.out.println(!true);
    }
}
