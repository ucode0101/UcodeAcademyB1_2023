package day_23_custom_method_continue;

import java.util.Arrays;

public class CustomMethodPractice5 {
    public static void main(String[] args) {

        char [] ch = convertStringToCharArray("java");

        System.out.println(Arrays.toString(ch));



    }

    // Create a method that takes string as parameter and return it as char array
    public static char[] convertStringToCharArray(String str){


        char [] chars = new char[str.length()];
       for (int i=0; i<str.length(); i++){
           chars[i] =str.charAt(i);
       }

       return chars;
    }

}
