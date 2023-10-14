package day_05_unary_shorthand_operators;

public class Recap {
    public static void main(String[] args) {
        /*
        1. Given intz= 198;
        verify that the number of z is even number
       2. byte a= 30;
      Int b =b +=a; what’s the value of b? compile error
         */

        int z = 199;
        boolean b1 = z % 2 == 0;

        System.out.println("is this number even ? "+ b1);

        byte a  =30;
        int b = 0;
        b +=a;
        System.out.println();

        // Task Salary calculator:
        // create an int variable hours
        // create a double rate
        // create a double resul
        // int months
        // Find out how much you make in a year

        int month = 12; // don't worry about months for now


        int hours = 40;
        double rate = 75.5;

        int weeks = 52;

        double annualSalary = hours * rate * weeks;

        System.out.println(annualSalary);
        System.out.println( annualSalary / month);

        System.out.println("=========================================");
     // I will share it in the cannel
        // Convert seconds to hours, and minute;
//
        int seconds = 3700;
        int hour = seconds / 3600; // because 60 minutes * 60 second ==  1 hour
        int minutes = (seconds % 3600)/ 60; // take the remainder and divide by 60

        System.out.println("Hours: "+hour+" Minute: "+ minutes);

        System.out.println("===================================");


        // Task write a program that check if a number is evenly divisible by 2, 3, 5

        int number = 30;

        boolean isDivisible2 = number % 2 ==0;
        boolean isDivisible3 = number % 3 == 0;
        boolean isDivisible5 = number % 5 ==0;

        System.out.println(isDivisible2);
        System.out.println(isDivisible3);
        System.out.println(isDivisible5);






    }
}
