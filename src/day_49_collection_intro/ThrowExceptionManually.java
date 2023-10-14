package day_49_collection_intro;

import java.io.IOException;

public class ThrowExceptionManually {

    public static void main(String[] args) {

        try {
            System.out.println(21/2);
        } catch (Exception e){
            System.out.println("catch block");
        } finally {
            System.out.println("I always run");
        }

        //throw new RuntimeException("Hello");
        //throw new IOException("Hi");

       if (39 / 10 > 10){
           System.out.println("Hello");
           throw new ArithmeticException("Hi");
       }
       else {
           //throw new ArithmeticException("hello");
       }
    }
}
