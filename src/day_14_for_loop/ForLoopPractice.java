package day_14_for_loop;

public class ForLoopPractice {
    public static void main(String[] args) {
        //Write a program that displays each even number between 1 and 32

        for (int i=1; i<=32; i++){

            if (i % 2 ==0){
                System.out.println(i);
            }
        }

        System.out.println("===================Printing Odd numbers======================");


        //Write a program that displays each odd number  between 1 and 32
        for (int number =1; number <=32; number++){
            if (number % 2  !=0){
                System.out.println(number);
            }
        }


    }
}
