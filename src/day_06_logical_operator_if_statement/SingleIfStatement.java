package day_06_logical_operator_if_statement;

public class SingleIfStatement {
    public static void main(String[] args) {

        int age = 55;

        if(age >= 18 ){

            System.out.println("You are eligible to vote");

        }
        System.out.println("==============================================");

        // Only people between 18 and 30 can vote

        if ( age >=18 && age <=30){
            System.out.println("You are eligible to vote");
            System.out.println("You are "+ age +" years old");
        }

        /*

     Write Java program that will accept three numbers and return the greatest number.
•     Input:number1: 4, number2: 8, number3: 1
•      Output:
      The greatest number is: 8
         */

        int number1 = 41;
        int number2 = 18;
        int number3 = 100;

        // if number1 greater than number2 and number3
        // Then this code will be executed

        if (number1 > number2 && number1 > number3){

            System.out.println("The greatest number is: "+ number1);
        }

        // if number2 greater than number1 and number3
        // Then this code will be executed
        if (number2 > number1 && number2 > number3){

            System.out.println("The greatest number is: "+ number2);
        }

        // if number3 greater than number1 and number2
        // Then this code will be executed
        if (number3 > number1 && number3 > number2){
            System.out.println("The greatest number is: "+ number3);
        }




    }
}
