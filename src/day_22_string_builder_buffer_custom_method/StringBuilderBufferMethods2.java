package day_22_string_builder_buffer_custom_method;

public class StringBuilderBufferMethods2 {

    public static void main(String[] args) {

        String str = "java";
        String s = "";

        for (int i=str.length()-1; i>=0; i--){

            s+=str.charAt(i);
        }

        System.out.println(s);

        System.out.println("============================");

        String str2 = "selenium";

        StringBuilder stringBuilder = new StringBuilder(str2);

        str2 = stringBuilder.reverse().toString();


        //str2 = new StringBuilder(str2).reverse().toString(); // reverse string with StringBuilder reverse method

        System.out.println(str2);

        System.out.println("====================================================");

        stringBuilder.charAt(0); // returns character at the given index as char

        stringBuilder.indexOf("x"); // return index of given char/string as an int

        stringBuilder.lastIndexOf("y"); // return last index of given char/string

        stringBuilder.length(); // returns the length of string builder/buffer as an int

        stringBuilder.substring(0,3); // returns from start index until end index as a string



    }
}
