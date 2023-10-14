package day_14_for_loop;

public class ForLoopPractice3 {
    public static void main(String[] args) {

        // Write a program to count home even and odd numbers from 1 to 50;

        int even =0;
        int odd =0;

        for (int i =1; i <=50; i++){
            if (i % 2 ==0){
                even +=1;
            }
            else{
                odd +=1;
            }
        }
        System.out.println("even number: "+even);
        System.out.println("odd number: "+odd);

        System.out.println("==========================");

        // Write a program to print from 50 to 1

        for (int i =50; i>=1; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("====Printing z to a");

        // Write a program to print from z to a
        for (char ch = 'z'; ch >='a'; ch --){
            System.out.print(ch+" ");
        }

    }
}
