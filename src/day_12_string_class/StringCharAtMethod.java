package day_12_string_class;

public class StringCharAtMethod {

    public static void main(String[] args) {
        // Index starts from 0 in Java
        //                       0123
        // example String str = "java"
        // charAt(); takes index/number and return char at given index

        // Task:
        // Create a string and use charAt()method get each char and assign to a char variable
        String str = "java";

        char ch1 = str.charAt(0);

        char ch2 = str.charAt(1);

        char ch3 = str.charAt(2);

        char ch4 = str.charAt(3);

        // Start from the last char and
        // Reverse a string using charAt() method

        String str2 = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        System.out.println(str2);

        System.out.println("===========================================");

        String word ="JavaAndSelenium";


        // Task:
        // Start from 0 and take every even index from String (word) and assign it to new String
        // 0246

        String res =""+word.charAt(0)+word.charAt(2)+word.charAt(4)+word.charAt(6)+word.charAt(8)+word.charAt(10)+word.charAt(12)+word.charAt(14);



        System.out.println(res);

        System.out.println("======================================================");

        // Task:
        // Write a program to first character of first name and first character of last name
        // and assign to a new string as initials

        String firstName = "Jame";
        String lastName = "Bond";

        String initial =""+ firstName.charAt(0)+lastName.charAt(0);

        System.out.println("Your initial is: "+initial);


















    }
}
