package day_06_logical_operator_if_statement;

public class IfStatementPractice {

    public static void main(String[] args) {
        /*
 1. Write a Java program that will accept two numbers and check if two numbers are equal or not.
2. Write a Java program to implement following logic using if statement 1. if hour is less than 12 noon, greet with Good Morning
 if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
if hour is greater than or equal to 3 pm, greet with Good Evening
         */


        // Task 1 Write a Java program that will accept two numbers and check if two numbers are equal or not.
        // Task 2 Write a Java program multiply two numbers if they are equal and print them
        // Task 2 If num1 is greater than num2 subtract num2 from num1

        //

        int num1 = 45;
        int num2 = 15;

        if ( num1 == num2){
            System.out.println("These numbers are equal");
        }

        System.out.println("==================================================");

        if (num2 == num1){
            num1 *=num2;
            System.out.println("The result of multiplications is: "+ num1);
        }

        System.out.println("================================================");
        //int res;

        if (num1 > num2){
           // res = num1 - num2;
           num1 -=num2;
            System.out.println("Subtract result: "+num1);

        }


        System.out.println("==================================================");

        /*
        2. Write a Java program to implement following logic using if statement
        1. if hour is less than 12 noon, greet with Good Morning
       if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
       if hour is greater than or equal to 3 pm, greet with Good Evening
         */

        int hour = 8;

        if (hour < 12){
            System.out.println("Good Morning");
        }

        if (hour >=12 && hour < 3){
            System.out.println("Good Afternoon");
        }

        if(hour >= 3){
            System.out.println("Good Evening");
        }

    }
}
