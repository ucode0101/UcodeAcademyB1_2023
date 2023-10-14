package day_10_switch_scanner;

import java.util.Scanner;

public class ScannerClassPractice01 {

    // This main method, every java class must have main method
    public static void main(String[] args) {
                   // println() is a method
        //System.out.println();

        // if we want to use Scanner Class methods, we need to create an Object/variable from Scanner class
        // and call any of those methods

        // Create object/variable so we can use it to call any of those methods
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, please enter your name");
        String name = scan.next(); // next() takes a single word as a string

        System.out.println("Hello "+name+" I am Java, if you see me in your dreams YOU ARE Doing great!");

        scan.close();



    }
}
