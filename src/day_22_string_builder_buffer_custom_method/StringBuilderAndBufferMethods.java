package day_22_string_builder_buffer_custom_method;

public class StringBuilderAndBufferMethods {
    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder("java");

        strBuilder.append("01"); // adding/concatenation

        System.out.println(strBuilder);
        System.out.println("========================");

        strBuilder.insert(0, "A"); // inserting value/str/obj at the given index

        System.out.println(strBuilder);
        System.out.println("========================");

        strBuilder.replace(0, 3,"AAA"); // replace from startIndex until endIndex with new str

        System.out.println(strBuilder);
        System.out.println("========================");

        strBuilder.delete(0,3); // delete from startIndex until endIndex
        System.out.println(strBuilder);

        System.out.println("========================");

        StringBuffer strBuffer = new StringBuffer("java");

        strBuffer.reverse(); // to reverse strBuilder or Buffer
        System.out.println(strBuffer);

        System.out.println("=====================");

       String str = strBuffer.toString(); // we convert/cast StringBuffer to String
        System.out.println(str);

        String s = String.valueOf(123); // Convert/cast number to String/as string

        String s2 =String.valueOf(strBuilder); // convert/cast strBuilder to String

        char ch = 'a';

        String s3 = String.valueOf(ch); // Converts char to string
        System.out.println(s3);
















    }
}
