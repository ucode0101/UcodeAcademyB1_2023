package day_22_string_builder_buffer_custom_method;

public class MethodPractice1 {

    public static void main(String[] args) {

       showNumber(6);
       showNumber(1000);

        System.out.println("==========================");

       printCharAt("selenium", 4);
       printCharAt("Java is getting interesting, or is it? :)",0);

        System.out.println("=========================");

        printFrom1ToNumber(10);

        System.out.println("===================");

        printFrom1ToNumber(50);

    }


    public static void showNumber(int number){

        System.out.println("The number is: "+number);
    }

    // Write a void method that takes 2 parameters, 1 int as an index, and 1 String
    // and prints character at the given number/index (assume the number is less than str.length())

    public static void printCharAt( String str, int index){

        System.out.println(str.charAt(index));
    }

    // Task x:
    // Write a method that take a number as an argument/parameter and print from 1 to given number

    public static void printFrom1ToNumber(int number){

        for (int i =1; i<=number; i++){
            System.out.println(i);
        }
    }



}
