package day_43_exceptions_continue_final;

public class CustomException {

    public static void main(String[] args) {

        try {
            System.out.println( 7 / 2);
        }
        catch (ArithmeticException ac){
           throw new ArithmeticException("Exception in CustomException class line 10");
        }

        int num = 55;
        if (num % 10 < 10){
            throw new RuntimeException("Just practicing some exception");
        }
    }


}
