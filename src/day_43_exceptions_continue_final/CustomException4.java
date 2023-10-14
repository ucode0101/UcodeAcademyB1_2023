package day_43_exceptions_continue_final;

public class CustomException4 {

    public static void main(String[] args) {

        try {
            throw new RuntimeException("Rung time");
        } catch (RuntimeException ab){
            System.out.println("Hello");
            throw new IndexOutOfBoundsException("Exception");
        }
        finally {

            throw new NullPointerException("Null Pointer");
        }


    }

}
