package day_08_if_statements_ternary_operators;

public class TernaryOperator {
    public static void main(String[] args) {

        int num1 = 151;
        int num2 = 23;

        int maxNum ;
       // This how we find max number out two numbers using if else statement
        if (num1 > num2){

            maxNum = num1;
        }
        else {
            maxNum = num2;
        }
        System.out.println(maxNum);

        System.out.println("=======================================");

        int n1 = 45;
        int n2 = 313;

        int max;

        max = (n1 > n2) ? n1 : n2;

        System.out.println(max);

        System.out.println("=================================");


        // Write a program to check the day of the week
        // 1 for Monday, 2 for Tuesday
        int week = -1;

        String dayOfTheWeek;

        if (week ==1 ){
            dayOfTheWeek = "Mon";
        }
        else if (week == 2){
            dayOfTheWeek = "Tue";
        }
        else if (week == 3){
            dayOfTheWeek = "Wed";
        }
        else if (week == 4){
            dayOfTheWeek = "Thu";
        }
        else if (week == 5){
            dayOfTheWeek = "Fri";
        }
        else if (week == 6){
            dayOfTheWeek = "Sat";
        }
        else if (week == 7){
            dayOfTheWeek = "Sun";
        }
        else {
            dayOfTheWeek = "Please enter from 1 to 7";
        }
        System.out.println(dayOfTheWeek);

        System.out.println("============================================");


        // Write a program to check the day of the week using Ternary Operator
        // 1 for Monday, 2 for Tuesday

        int num =17;
        String daysOfWeek;

        daysOfWeek = (num == 1) ? "Mon" : (num == 2) ? "Tue" : (num == 3) ? "Wed" : (num == 4) ? "Thu"
                : (num == 5) ? "Fri" :(num == 6) ? "Sat" : (num == 7) ? "Sun" : "Please enter from 1 to 7";

        System.out.println(daysOfWeek);

        System.out.println("=========================================");

        // Write a program to check if the number is even

        int num3 = 25;

       if (num3 % 2 ==0){
           System.out.println("it is even number");
       } else {
           System.out.println("It is odd number");
       }

        System.out.println("===========================================");

       String str2 = (num3 % 2 == 0) ?"It is even number" : "It is odd number";

        System.out.println(str2);








    }
}
