package day_15_for_loop_continue;

import java.util.Scanner;

public class CountVowelsChars {
    public static void main(String[] args) {
        // There 5/6 vowels chars in English alphabet
        // a, e, i, o, u
        // Task:
        // Write a program to ask user to enter a string/sentence, and  count how many vowels in string/sentence

        String vowels ="aeiou";
        int vowelCount =0;

        String str ="";
        System.out.println("Please Enter a word/sentence");

        //Scanner scan = new Scanner(System.in);

        str = new Scanner(System.in).nextLine(); // We can call Scanner class method this way/without creating an object/variable

        for (int i=0; i<str.length(); i++){
            if (vowels.contains(""+ str.charAt(i))){
                vowelCount ++;
            }
        }
        System.out.println("Count of Vowels:\n"+vowelCount);

    }
}
