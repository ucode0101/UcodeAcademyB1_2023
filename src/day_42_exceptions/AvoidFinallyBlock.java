package day_42_exceptions;

public class AvoidFinallyBlock {

    public static void main(String[] args) {
        try {
            System.out.println(34/ 0);
            System.exit(99); // This will stop our program completely
        }
        catch (Exception e){
            System.out.println("Hello from catch block");
            System.exit(1); // This will stop our program completely
        }
        finally {
            System.out.println("Hello from finally block");
        }

        System.out.println("============================================");
        System.out.println("I'm outside of try, catch and finally block");
    }
}
