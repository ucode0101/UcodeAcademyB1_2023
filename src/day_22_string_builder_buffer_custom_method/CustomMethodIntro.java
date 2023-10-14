package day_22_string_builder_buffer_custom_method;

public class CustomMethodIntro {

    public static void main(String[] args) {

        // Task 1:
        // Write program to print "Hello" 10 times

//        for (int i =0; i<10; i++){
//            System.out.println("Hello");
//        }


        printHello10Times(); // prints Hello 10 times
        printHello10Times(); // prints Hello 10 times
        printHello10Times(); // prints Hello 10 times
        printHello10Times(); // prints Hello 10 times
        printHello10Times(); // prints Hello 10 times

        System.out.println("======================================");

        sayHello();

        System.out.println("================================");

        print1To10();



    }

    public static void printHello10Times(){ // Method without parameter/argument

        for (int i=0; i< 10; i++){

            System.out.println("Hello");
        }


    }

    public static void sayHello(){ // Method without parameter/argument
        System.out.println("Hello");
    }
// Write a void method to print 1 to 10;

    public static void print1To10(){ // Method without parameter/argument

        for (int i=1; i<=10; i++){
            System.out.println(i);
        }
    }




}
