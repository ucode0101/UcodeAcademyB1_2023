package day_10_switch_scanner;

import java.util.Scanner;

public class ScannerSwitchPractice {
    public static void main(String[] args) {

        // Task:
        // Write a program that takes a number from the user (1 to 7);
        // and prints the day of the week based on user's input
        // example -> 1 for monday, 2 for Tuesday...
        // Your program should take of any number below 1 or above 7

        // Declaring/creating object/variable from Scanner class
        Scanner abc = new Scanner(System.in);

        System.out.println("Hello, enter a number from 1 to 7");

        short num = abc.nextShort();
        String str ="";

        switch (num){

            case 1: // to make it easy to understand think of if(num == 1), even though switch does not accept boolean
              str+="Mon";
              break; // We use break statement to break out of switch/case statement if the case matches

            case 2:
                str += "Tue";
                break;
            case 3:
                str += "Wed";
                break;
            case 4:
                str +="Thu";
                break;
            case 5:
                str += "Fri";
                break;
            case 6:
                str += "Sat";
                break;
            case 7:
                str += "Sun";
            default:
                str += "The num is below 1 or above 7";


        }
        abc.close(); // closing scanner
        System.out.println(str);


    }
}
