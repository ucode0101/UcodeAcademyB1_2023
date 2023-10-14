package day_44_oop_abstraction;

public class ExceptionsReview2 {
    public static void main(String[] args) {

        String str ="Java";

       try {
           System.out.println(str.charAt(10));
     }
       catch (IndexOutOfBoundsException  e){
           System.out.println("The index is out of range");
           System.out.println("Trying next try-catch block");

           try {
               System.out.println(str.charAt(2));
           } catch (IndexOutOfBoundsException ab){
               System.out.println("");
           }

       }
       finally {

           System.out.println("I always run");
       }
    }
}
