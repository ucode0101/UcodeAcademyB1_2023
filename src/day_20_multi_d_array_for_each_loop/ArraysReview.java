package day_20_multi_d_array_for_each_loop;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {

        // Task 1:
        //Write a program to check if char array contains all characters from string
        // str ="java" charArr =['a','b',d'

        String str = "java";

        char [] chars = {'a','b','c','v','a','d','j','v','y'};

        for (int i =0; i< chars.length; i++){

            if (str.contains(""+chars[i])){ // we check if str contains this char

                str = str.replaceFirst(""+chars[i],""); // we replace the fist matching char with ""

            }
        }
        System.out.println(str.length() == 0);
        System.out.println(str.length());

        System.out.println("===============================================");

        //Task 2:
        //Write a program to check if two strings have same characters (not equal)
        //example -> "abc" and "cab" have same characters.
        //Hint: convert both strings toCharArray()....

        String str1 = "abc";
        String str2 = "cab";

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        str1 = new String(ch1); // Assigning a new value using new keyword and char Array
        str2 = new String(ch2);  // Assigning a new value using new keyword and char Array

        System.out.println(str1.equals(str2));

        System.out.println("===============================");

        boolean isSame = Arrays.equals(ch1, ch2);
        System.out.println(isSame);

        System.out.println("=============================================");

        String s1 = Arrays.toString(ch1); // Converting to String using Arrays.toString()

        System.out.println(s1);

        String s2 = new String(ch2);//

        System.out.println(s2);

        String [] ar ={"java","api"};















    }
}
