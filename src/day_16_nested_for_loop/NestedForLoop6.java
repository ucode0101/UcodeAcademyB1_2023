package day_16_nested_for_loop;

public class NestedForLoop6 {

    public static void main(String[] args) {

        // HomeWork Task 2
        //Task 2:
        //Factorial of number is the sum of multiplication of all the integers smaller than that positive integer.
        //Example: 5 is 5 * 4 * 3 * 2 * 1 which equals to 120
        //Write a program to ask user to enter a number from 5 to 20 and return
        //factorial of number

        int factorial =1;

        for (int i=5; i>=1; i--){
            factorial *=i;
        }
        System.out.println(factorial);

        // Task 1:
        // Write a program to print from 1 to 30
        // if a number is divisible by 3 print "FIN"
        // if number is divisible by 5 print "RA"
        // if number is divisible by 3 and 5 print "FINRA"
        //  example -> 1 2 FIN 4 RA FIN...

        //Task 2:
        // Write a program to take a number, if the number is even
        // print 1 to given number
        //1
        //12
        //123
        //1234
        // if the number is odd print 1 to given number
        //12345678910
        //123456789
        //12345678



    }
}
