package day_12_string_class;

public class StringLengthMethod {
    public static void main(String[] args) {
             //       0123
        String str = "java";// what is the length

        int strLength = str.length();

        System.out.println(strLength);

        // Find the last char from the string

        System.out.println(str.charAt(strLength-1)); // we will get exception/error here
        System.out.println("================================");

        System.out.println(str.charAt(strLength-1)); //

        // Task:
        // Write a program to check if the length of a string is even or odd

        System.out.println("========================================");

        String str2 ="testingJav";

        int num = str2.length();

        if (num % 2 ==0){
            System.out.println("The length is even for "+str2);
        }
        else {
            System.out.println("The length is odd for: "+str2);
        }










    }
}
