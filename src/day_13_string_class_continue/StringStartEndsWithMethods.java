package day_13_string_class_continue;

public class StringStartEndsWithMethods {
    public static void main(String[] args) {
        String str = "selenium";

        boolean b1 = str.startsWith("sele");
        System.out.println(b1);

        boolean b2 = str.endsWith("um");
        System.out.println(b2);
    }
}
