package day_14_for_loop;

public class StringCharAtVsSubstring {
    public static void main(String[] args) {

        String str = "javaAndSelenium";

        // Take first 4 char from str as a string

        String str2 = str.substring(0,4);
        System.out.println(str2);

        // substring() is used to take part of string; returns string
        // we can give start and ending, or we can just give start and by default it takes until the end

        // Write a program to take first, middle and last chars from string as string using substring()

        String result = str.substring(0,1) + str.substring(str.length()/2, (str.length()/2) +1) + str.substring(str.length()-1);
        System.out.println(result);

        // Write a program to take first, middle and last chars from string using charAt()

        String result2 = ""+str.charAt(0) + str.charAt(str.length()/2) + str.charAt(str.length()-1);
        System.out.println(result2);




    }
}
