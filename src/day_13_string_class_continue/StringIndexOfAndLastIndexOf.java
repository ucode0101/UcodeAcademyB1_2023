package day_13_string_class_continue;

public class StringIndexOfAndLastIndexOf {
    public static void main(String[] args) {
        String str = "selenium";

       int num = str.indexOf('i');
        System.out.println(str.indexOf("w"));

        System.out.println(num);
        System.out.println("=======================================");

        int num2 = str.indexOf('e');
        System.out.println(num2);

        int num3 = str.lastIndexOf('e');
        System.out.println(num3);


    }
}
