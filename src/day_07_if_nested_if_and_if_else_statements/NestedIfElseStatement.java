package day_07_if_nested_if_and_if_else_statements;

public class NestedIfElseStatement {

    public static void main(String[] args) {

        // Write a program to check if the user is eligible to buy a PlayStation
        // Pre condition the user must be at least 18 years old, and the user must be Male/guy


        int age = 21;
        String gender ="Male";

        if (age >15){

            if (gender == "Female"){
                System.out.println("You are eligible to buy PS");

            }
            else{
                System.out.println("You are eligible to buy iPhone 14 Pro");
            }
        }
        else {
            System.out.println("Sorry you are not old enough");
        }

        System.out.println("========================================================");

        // Write a program to check if the number is greater than 50 and less than 150
        // and the number is even

        int num = 148;

        if (num > 50 ){

            if (num % 2 ==0 && num < 150){
                System.out.println("Your number is eligible");
            } else {
                System.out.println("Your number is not eligible");
            }


        }
        else {
            System.out.println("Sorry, the number is less than 50");
        }

        System.out.println("======================================");

        if (num > 50 && num < 150 && num % 2 ==0){
            System.out.println("Your number is eligible");
        }
        else {
            System.out.println("Sorry, the number is less than 50");
        }



    }
}
