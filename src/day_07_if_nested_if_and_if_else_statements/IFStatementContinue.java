package day_07_if_nested_if_and_if_else_statements;

public class IFStatementContinue {

    public static void main(String[] args) {

        char ch1 ='C';

        if(ch1 >= 97 && ch1 <= 122){
            System.out.println("It is a lower case character: "+ch1);
        }

        boolean b1 = true;

        if (b1 == true){
            System.out.println("b1 is true");
        }

        if (b1){
            System.out.println("I'm true");
        }

        System.out.println("===============================");

        boolean isWeatherCold = true;

        if (isWeatherCold == true){
            System.out.println("Put on your jacket");
        }

        if (isWeatherCold){
            System.out.println("Put on your jacket");
        }

        System.out.println("===========================================");

        boolean isWeatherHot = false;

        if (isWeatherHot !=false){
            System.out.println("Go swimming");
        }
        System.out.println("+++=====================+++");

        if (!isWeatherHot){
            System.out.println("Go swimming");
        }

        System.out.println("=============================");



        //Task 1:
        // The triangle is valid if sum of angles are equal to 180
        // create 3 int variables and sum/add them to check if it is a valid triangle

        int angle1 = 60;
        int angle2 = 70;
        int angle3 = 50;

        if (angle1+angle2+angle3 == 180){
            System.out.println("It is a valid triangle");
        }

        System.out.println("======================================");
        // Task 2:
        // Write a java program to find the minimum number out of three (assume none of them are equal)

        int n1 = 5;
        int n2 = 2;
        int n3 = 1;

        if (n1 < n2 && n1 < n3){
            System.out.println("The smallest number is: "+ n1);
        }

        if (n2 < n1 && n2 < n3){
            System.out.println("The smallest number is: "+ n2);
        }

        if (n3 < n1 && n3 < n2){
            System.out.println("The smallest number is: "+n3);
        }









    }
}
