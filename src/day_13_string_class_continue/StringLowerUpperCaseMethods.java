package day_13_string_class_continue;

public class StringLowerUpperCaseMethods {

    public static void main(String[] args) {

        String str1 ="java";

        str1 = str1.toUpperCase(); // str1 is converted to upper case permenently

        System.out.println(str1); // it just prints in upper case
        System.out.println(str1);

        System.out.println("================================");

        String str2 = "API";

        str2 = str2.toLowerCase();
        System.out.println(str2);

        System.out.println("==================================");

        String methodChaining = str1.toLowerCase().concat(str2.toUpperCase());
        System.out.println(methodChaining);

        System.out.println(str1);
        System.out.println(str2);




    }
}
