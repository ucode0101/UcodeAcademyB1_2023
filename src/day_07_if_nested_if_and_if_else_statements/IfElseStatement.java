package day_07_if_nested_if_and_if_else_statements;

public class IfElseStatement {

    public static void main(String[] args) {
        //Task 1) Declare and initialize a number
        //1. Write a Java program:
        //2) Display whether the number is an odd number or even number.

        byte b1 = 14;

        if (b1 % 2 ==0) {
            System.out.println(b1 +" is Even number");
        }
        else {
            System.out.println(b1 + " is Odd number");

        }

        System.out.println("======================================");


        //2. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
        // Write a program that declares three integers as angles and check whether a triangle is valid or not.

        int angel1 = 45;
        int angel2 = 56;
        int angel3 = 79;
        int triangle = angel1+angel2+angel3;

        if (triangle == 180){
            System.out.println("It is a Valid Triangle: "+ triangle);
        }
        else {
            System.out.println("This is not a Valid Triangle: "+triangle);
        }

        System.out.println("================================");

        //3. Write a Java program to implement following logic using if-else statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
        //3. if hour is greater than or equal to 3 pm, greet with Good Evening

        int hour = 19;

        if (hour <12){
            System.out.println("Good morning");
        }
        else if (hour >=12 && hour <15){
            System.out.println("Good afternoon");
        }
        else {
            System.out.println("Good evening");
        }










    }
}
