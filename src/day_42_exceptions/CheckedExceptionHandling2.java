package day_42_exceptions;

public class CheckedExceptionHandling2 {

    public static void main(String[] args) throws InterruptedException {
        // Handling Checked exception using throws keyword
        System.out.println("Hello");
        Thread.sleep(5000);
        System.out.println("Hello after 5 seconds");
    }
}
