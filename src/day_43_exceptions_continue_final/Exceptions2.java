package day_43_exceptions_continue_final;

public class Exceptions2 {

    public static void wait5Seconds() throws InterruptedException{
        Thread.sleep(5000);
    }

    public static void wait4Seconds(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        //wait5Seconds(); // we need to handle the exception because we used throws keyword in our custom methods
        wait4Seconds();
    }
}
