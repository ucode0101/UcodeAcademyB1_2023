package day_11_scanner_class_continue;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
        // Write a java program to take input from user (boolean -true/false)
        // if the weather is nice, and you don't have any Java task go outside and have fun
        // else stay home and do your java tasks
        // verify/validate tha the user enters boolean. true for yes, false for no

        boolean isWeatherNice = false;


        Scanner input = new Scanner(System.in);

        System.out.println("Is Weather nice?");

        if (input.hasNextBoolean()){

            isWeatherNice = input.nextBoolean();

        } else{
            System.out.println("Please enter true for Yes, and false for No");

            System.exit(1); // this is used to stop our code/ exit our code
            // We don't want to go to the next line that's why we exit the code here
        }


        System.out.println("Do you have any Java task?");
        boolean anyJavaTask = false;

        if (input.hasNextBoolean()){
            anyJavaTask = input.nextBoolean(); // it is not assigning the user input true/flase

        }
        else{
            System.out.println("Please enter true for Yes, and false for No");
        }
            // isWeatherNice == true.  !anyJavaTask == false
        if (isWeatherNice && !anyJavaTask ){
            System.out.println("Go out and have fun");
        }
        else {
            System.out.println("Stay home and finish your java tasks");
        }







    }
}
