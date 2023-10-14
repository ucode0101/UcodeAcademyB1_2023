package day_42_exceptions;

public class UncheckedExceptionHandling {

    public static void main(String[] args) {
        String str = "Java";

        try {
            System.out.println(str.charAt(10));

        } catch (Exception e){
            System.out.println("Hello, index 10 is out of bound");
        }

        String str2 = "abc";
        try {
            System.out.println(str2.substring(4));
        }
        catch (Exception obj){
            System.out.println(obj.getMessage());
        }

    }
}
