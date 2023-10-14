package day_07_if_nested_if_and_if_else_statements;

public class NestedIFStatement {

    public static void main(String[] args) {

        int num1 = 54;

        if (num1 > 10){

            if (num1 % 2 ==0){
                System.out.println("This number is greater than 10 and it's even number");
            }

        }
        System.out.println("==========================================");

        // Task 3:
        // Write a java program to check if a number is greater than 15 and is Odd number (use nested if)

        int num2 = 79;

        if (num2 > 15){

            if (num2 % 2 !=0){
                System.out.println("This number is greater than 15 and it is odd number");
            }
        }
        System.out.println("==============================");


        // Task 4:
        // Write a java program to check if the age is greater than 19 and gender is Female
        //Print Welcome to ladies party

        int age =20;
        char gender = 'F';

        if (age >=20){

            if (gender == 'F'){
                System.out.println("Welcome to ladies party");
            }

        }




    }
}
