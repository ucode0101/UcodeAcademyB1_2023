package day_14_for_loop;

public class StringContainsVsEquals {

    public static void main(String[] args) {

        // Write a program to check if two string are equal

        String str1 = "java";
        String str2 = "java and selenium";

        boolean b1 = str1.equals(str2); // it only returns true if these two string are identical
        System.out.println(b1);


        System.out.println("======================================");

        // Write a program to check if one string contains a given string/contains another string

        boolean b2 = str2.contains("a");
        System.out.println(b2);


    }
}
