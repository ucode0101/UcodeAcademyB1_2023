package day_24_custom_method_recap;

import java.util.Random;

public class MethodOverloadingPractice4 {

    public static void main(String[] args) {

        char ch = getRandomChar("selenium");

        System.out.println(ch);
    }

    // Write/create a method that takes a string as parameter and return random character
    public static char getRandomChar(String str){
        Random randomNumber = new Random();

        int index = randomNumber.nextInt(str.length());

        return str.charAt(index);

    }
}
