package day_13_string_class_continue;

public class StringMethodsPractice1 {
    public static void main(String[] args) {

        String str = "seleniums";

        // Method chaining/string manipulation
        String str2 = str.substring(0,2).toUpperCase().concat(str.substring(str.length()-2)).replace("E","O");

        System.out.println(str2);

        // First way using charAt get first and last char from string
        int lastIndex = str.length()-1;
        char startCh = str.charAt(0);
        char endCh = str.charAt(str.length()-1);

        boolean b1 = startCh == endCh;
        System.out.println(b1);

        System.out.println("===================================");

        // Second way using substring get first and last char from string as a string

        String startStr = str.substring(0,1);
        String endStr = str.substring(str.length()-1);

        boolean  b2 = startStr.equalsIgnoreCase(endStr);

        System.out.println(b2);
        System.out.println("=============================");

        // Third way using start/ends with method

        boolean b3 = str.endsWith(startStr);
        boolean b4 = str.startsWith(endStr);
        System.out.println(b3);
        System.out.println(b4);

        // Fourth way using method chaingin

        boolean b5 = str.charAt(0) == str.charAt(str.length()-1);
        System.out.println(b5);







    }
}
