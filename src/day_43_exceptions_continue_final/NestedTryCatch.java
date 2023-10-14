package day_43_exceptions_continue_final;

public class NestedTryCatch {

    public static void main(String[] args) {

        // Nested -> Having another try & catch inside of catch block
        try {
            System.out.println(6 / 0);
        }
        catch (ArithmeticException e){
            System.out.println("Outer catch block");

            try {
                System.out.println(7 / 0);
            }
            catch (ArithmeticException eab){
                System.out.println("Inner catch block");
                try {
                    Thread.sleep(1000);
                    System.out.println("Inner Inner try block");

                }
                catch (InterruptedException abc){
                    System.out.println("Inner Inner Catch block");
                }
            }

        }

        System.out.println("=============================================");

        try {
            System.out.println("Hello");
            try {
                System.out.println("Hello again");

            }
            catch (Exception ab){
                System.out.println("Hi");

            }
        } catch (ArithmeticException abc){
            System.out.println();

        }



    }
}
