package day_23_custom_method_continue;

public class MethodCalling1 {
    // Write a method that take number as a parameter, if number is even print from 1 to given number
    // if number is odd print from given number to 1
    // example -> 10 => 123... 11 => 11 10 9...

    public static void main(String[] args) {

    }

    public static void printOneToGivenNum(int num){

        for (int i=1; i<=num; i++){
            System.out.println(i);
        }
    }

    public static void printFromGivenNumToOne(int num){

        for (int i=num; i>=1; i++){
            System.out.println(i);
        }
    }

    // Calling another methods
    public static void printNumber(int num){

        if (num % 2 ==0){
            printOneToGivenNum(num);
        }
        else {
            printFromGivenNumToOne(num);
        }

    }

}
