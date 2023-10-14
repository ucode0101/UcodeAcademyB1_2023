package day_21_arrays_loops_string_builder_buffer_intro;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("java1");
        StringBuffer str2 = new StringBuffer("java2");

        str1.append("00"); // adds/append at the by default

        str1.insert(1, "ABC"); // insert at the given position/index

        str1.replace(1,3,"111"); // replace from start index to end index with given string

        str1.delete(0,2);



        System.out.println(str1);

        String str3 ="java3"; // Only String allows creating an object/variable this way

        str3 = str3 + "00";




    }
}
