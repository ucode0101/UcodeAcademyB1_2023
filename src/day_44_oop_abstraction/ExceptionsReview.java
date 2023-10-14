package day_44_oop_abstraction;

public class ExceptionsReview {

    public static void customWait(int seconds){
        try {
            Thread.sleep((long) seconds * 1000);
        } catch (InterruptedException e){

        }
    }

    public static void main(String[] args)  {
        customWait(10);

       // Using try-catch multiple times in the main method
        System.out.println("Hello ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){

        }
        System.out.println("Hello after 2 second");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){

        }
        System.out.println("Hello again after 2 seconds");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){

        }
        System.out.println("Bye");

    }
}

class Test{

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Hello");
        Thread.sleep(2000);
        System.out.println("Hello after 2 seconds");
        Thread.sleep(2000);
        System.out.println("Hello again after 2 seconds");
        Thread.sleep(2000);
    }
}