package day_14_for_loop;

public class ForLoopContinue {
    public static void main(String[] args) {
        // Write a program to print all chars from string, but skip 'e'

        String str = "selenium";
        System.out.println("Printing all char, skipping 'e'\n");

        for (int i=0; i<= str.length()-1; i++){

            if (str.charAt(i) == 'e'){
                continue; // skip current iteration and go to the next one/continue == skip
            }
            else {
                System.out.print(str.charAt(i));
            }

        }
        System.out.println();
        System.out.println("Skipping all numbers divisible by 3\n");
        // Write a program to print from 1 to 50, but skip all numbers that divisible by 3
        for (int i=1; i<=50; i++){
            if (i % 3 ==0){
                continue;
            }
            else {
                System.out.print(i+" ");
            }
        }
    }
}
