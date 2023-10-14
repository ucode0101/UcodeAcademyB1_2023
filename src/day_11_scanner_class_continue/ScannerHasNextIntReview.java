package day_11_scanner_class_continue;

import java.util.Scanner;

public class ScannerHasNextIntReview {

    public static void main(String[] args) {
        // Validate if the user enters String, char Special char (not number)

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num=0;
        if (input.hasNextInt()){
           // num += input.nextInt();
            System.out.println(input.nextInt());

        }
        else {
            System.out.println("Please enter a valid number");
        }
      //  System.out.println(num);


    }
}
