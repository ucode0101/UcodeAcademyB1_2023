package office_hours.day_02_coding_practice;

import java.util.Arrays;

public class Anagram {

    // Write a program to check if two given string is anagram.
    // Anagram -> when two strings built out of same characters/letters (not equal)
    // It doesn't matter if upper case characters or lower case

    // Java -> aajv
    public static void main(String[] args) {

        System.out.println(isAnagram("heloM","HeolL"));
        System.out.println(isAnagram2("Hello","OlLeH"));

    }


    public static boolean isAnagram(String str1, String str2){
        // To make sure str1 and str2 are the same length
        if (str1.length() != str2.length()){
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i =0; i< str1.length(); i++){

            String charFromStr1 =""+ str1.charAt(i);

            if (str2.contains(charFromStr1)){
                str2 = str2.replaceFirst(charFromStr1,"");
            }

        }

        return str2.isEmpty();

    }

    public static boolean isAnagram2(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);


    }


}
