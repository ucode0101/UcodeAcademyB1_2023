package day_20_multi_d_array_for_each_loop;

import java.util.Arrays;

public class LoopNestedLoopPractice {

    public static void main(String[] args) {

        // Write a program to find the longest word from string/sentence (each word is separate by a space " "

        String str = "When can any loop inside any other loop including for each loop";
        //String [] strArray = str.split(" "); // it returns each word as a string array splitting from space " " not including space

        String longWord ="";

        for (String each : str.split(" ")){

            if (each.length() > longWord.length()){
                longWord = each;
            }
        }
        System.out.println(longWord);

        System.out.println("=============================================");

        String longWord2 ="";
        for (int i=0; i< str.split(" ").length; i++){
            if (str.split(" ")[i].length() > longWord2.length()){
                longWord2 = str.split(" ")[i];

            }

        }
        System.out.println(longWord2);




    }
}
