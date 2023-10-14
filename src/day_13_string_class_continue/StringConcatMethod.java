package day_13_string_class_continue;

import java.util.Scanner;

public class StringConcatMethod {
    public static void main(String[] args) {
        String str ="java";

       // str = str + " selenium"; // Regular long way

        // using shorthand operator
        //str += " selenium";

        // String str2 = str+" selenium";
        String str2 = str.concat(" selenium");

        System.out.println(str2);

        System.out.println("========================================");


       str2 =  str2.concat(" and api");

        System.out.println(str2);

        // Task 1:
        // Write a program to ask user to enter first, last name, and age
        // and assign the in a new as full name/info

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");

        String firstName = scan.nextLine();
        System.out.println("enter last name");
        String lastName = scan.nextLine();

        System.out.println("enter your age");
        int age = scan.nextInt();

        String fullNameAndAge = firstName.concat(" "+lastName+" ").concat(" "+age);

        System.out.println(fullNameAndAge);




    }
}
