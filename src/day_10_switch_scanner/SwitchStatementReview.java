package day_10_switch_scanner;

import java.util.Scanner;

public class SwitchStatementReview {
    public static void main(String[] args) {

        String name = "Selenium";

        switch (name){

            case "java":
                System.out.println("Hello "+name);
                break;

            case "Java":
                System.out.println("Hi "+name);
                break;

            default:
                System.out.println("Bye "+name);

        }

        // Task 1:
        // Write a program to print number to String
        // example -> String str = "one" -> 1
        // assume the string value is one to five

    }
}
