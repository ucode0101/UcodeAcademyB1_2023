package day_42_exceptions;

public class TryCatchFinallyBlocks {
    public static void main(String[] args) {

        // Using finally block with Checked/Compile-time exception
        System.out.println("Hello");
        try {
            Thread.sleep(4000);
        } catch (Exception e){
            System.out.println("Hello");
        }
        finally {
            System.out.println("I always get executed");
        }

        System.out.println("================================");

        try {
            System.out.println(12/2);
        }
        catch (Exception a){
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("I always get executed");
        }

    }
}
