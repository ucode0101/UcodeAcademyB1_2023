package day_17_while_do_while_loops;

import java.util.Scanner;

public class WhileDoWhileLoop3 {
    public static void main(String[] args) {

        // Ask user to enter yes or now

        String answer ="";

        System.out.println("Please enter yes or no");
        Scanner scan = new Scanner(System.in);
        answer = scan.nextLine();

        while (true){

            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")){
                System.out.println("You entered "+ answer);
                break;
            }
            else {
                System.out.println("Please re enter");
                answer = scan.nextLine();
            }


        }





    }
}
