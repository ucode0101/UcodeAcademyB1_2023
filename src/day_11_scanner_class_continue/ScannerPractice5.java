package day_11_scanner_class_continue;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {
        // Write a java program to take input from user yes or no
        // if the weather is nice, and you don't have any Java task go outside and have fun
        // else stay home and do your java tasks
        // verify/validate tha the user enters yes or no

        Scanner scan = new Scanner(System.in);
        boolean isWeatherNice = false;
        boolean anyJavaTask = false;

        System.out.println("Is Weather nice?");
        String answer1 = scan.next();

        System.out.println("Do you have any Java task?");
        String answer2 = scan.next();

        if (answer1.equals( "yes")) {
            isWeatherNice = true;

        } else {
            isWeatherNice = false;
        }
        if (answer2.equals("no")) {
            anyJavaTask = false;
        } else {
            anyJavaTask = true;
        }
        if (isWeatherNice && !anyJavaTask) {
            System.out.println("Go out have fun");
        } else {
            System.out.println("Stay home and your task");
        }

    }
}

