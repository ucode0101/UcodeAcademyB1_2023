package day_49_collection_intro;

import java.io.IOException;

public class CheckedException {

    public static void wait5seconds() throws Exception{
        Thread.sleep(5000);
    }

    public static void main(String[] args) throws Exception{
        //wait5seconds();

        // First way
        // We need to handle InterruptedException
        Thread.sleep(2000);



        // Second
        // Using try catch block
        try {
            throw new InterruptedException("");
        } catch (InterruptedException e){
            System.out.println("Catch block");
        }






    }
}
