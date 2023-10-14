package day_42_exceptions;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        int a = 5;
        int b =0;
        String str = "Java";

        try {
            System.out.println(a / b); // throws an exception, and goes to catch block
            System.out.println("hello"); // this will not be executed
        }
        catch (ArithmeticException ab){
            System.out.println("First Catch block");
        }
        System.out.println("=================================================");

        try {
            System.out.println(a / b);
            //System.out.println(str.charAt(10));
        }
        catch (IndexOutOfBoundsException abc){
            System.out.println("Index out of bound");

        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }




    }
}
