package day_15_for_loop_continue;

import java.util.Scanner;

public class SumNumsFromString {
    public static void main(String[] args) {

        // Task:
        // Write a program to ask user to enter a string/sentence mixed with number
        // and return sum of all numbers from the string/sentence
        // example: j4a8jt1tj2 --> 15 as an int/number
        // 0-9 in ASCII table represent 48-57
        // 1-> 49, 2 ->50,

        String str ="";
        int sumOfDigits =0;

        System.out.println("Please enter a word with digits in it");
        Scanner input = new Scanner(System.in);


        str = input.nextLine();


        for (int i=0; i< str.length(); i++){
            if (str.charAt(i) >= 47 && str.charAt(i) <=57){
                sumOfDigits += str.charAt(i)-48; // 2 -> 50-48 =
            }
        }

        System.out.println(sumOfDigits);
        System.out.println("=====================================");

        int n = 'a';

    }
}
