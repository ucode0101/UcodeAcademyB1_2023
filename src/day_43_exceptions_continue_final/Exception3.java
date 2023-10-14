package day_43_exceptions_continue_final;

public class Exception3 {

    static String str =null;
    static String str2;


    public static void main(String[] args) {

        // Bellow two examples will throw NullPointerException,
        // because one has null, and the other one is not initialized
        System.out.println(str.charAt(1));
        System.out.println(str2.substring(0,1));

    }
}
