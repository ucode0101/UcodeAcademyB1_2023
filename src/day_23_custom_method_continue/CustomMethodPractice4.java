package day_23_custom_method_continue;

public class CustomMethodPractice4 {
    public static void main(String[] args) {

        printNumber(10);
        System.out.println("=====================");
        printNumber(11);
        System.out.println("=========================");

        System.out.println(printNumber2(11));

        System.out.println("====================");
        String s = printNumber2(10);
        System.out.println(s);

    }

    // Write a method that take number as a parameter, if number is even print from 1 to given number
    // if number is odd print from given number to 1
    // example -> 10 => 123... 11 => 11 10 9...

    public static void printNumber(int num){

        if (num % 2 ==0){
           for (int i=1; i<=num; i++){
               System.out.print(i+" ");
           }
        } else {
            for (int j=num; j>=1; j--){
                System.out.print(j+" ");
            }
        }
        System.out.println();

    }

    public static String printNumber2(int num){
        String str ="";
        if (num % 2 ==0){
            for (int i=1; i<=num; i++){

                str += i+" ";

            }

        } else {
            for (int j=num; j>=1; j--){

                str += j+" ";
            }
        }
        return str;

    }
}
