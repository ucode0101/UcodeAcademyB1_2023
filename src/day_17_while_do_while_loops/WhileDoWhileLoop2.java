package day_17_while_do_while_loops;

public class WhileDoWhileLoop2 {
    public static void main(String[] args) {

        //Write a program using while loop, that calculates the sum of the even numbers between 0 and 10

        int number =0;
        int sumOfEven = 0;

        while (number <=10){
            if (number % 2 ==0){
                sumOfEven +=number;
            }
            number ++;

        }
        System.out.println(sumOfEven);

        System.out.println("==========================================");

        int num =0;

        int sumOfEven2=0;

        do {
            if (num % 2 ==0){
                sumOfEven2 +=num;
            }
            num ++;

        } while (num <=10);

        System.out.println(sumOfEven2);




        //Write a program that asks user to enter his/her username and password until user enters correctly.
    }
}
