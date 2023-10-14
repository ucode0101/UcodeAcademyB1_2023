package day_09_if_ternernary_review_switch_statement;

public class NightWarmUpTask {
    public static void main(String[] args) {


        // Guessing game
        // Write a program that guesses the user's input
        // Give a number from 1 to 10
        // The program tells you if you guessed higher or lower


        int magicNumber = 5;
        int guessNum = 5;

        if (guessNum < magicNumber){
            System.out.println("Please guess higher");


        }
        else if (guessNum > magicNumber) {
            System.out.println("Please guess lower");

        }
        else {
            System.out.println("You guessed right");
            System.out.println("Magic number is: "+ magicNumber);
        }

    }
}
