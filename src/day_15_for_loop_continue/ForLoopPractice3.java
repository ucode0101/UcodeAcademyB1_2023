package day_15_for_loop_continue;

public class ForLoopPractice3 {
    public static void main(String[] args) {
        // write a program to return sum all numbers from 1 to 50;

        int sumOfNumbers =0;
        for (int i=1; i<=50; i++){
            sumOfNumbers +=i;
        }
        System.out.println(sumOfNumbers);
    }
}
