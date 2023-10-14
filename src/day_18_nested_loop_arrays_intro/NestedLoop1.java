package day_18_nested_loop_arrays_intro;

public class NestedLoop1 {
    public static void main(String[] args) {
        // Write a program to print from 1 to 5 five times

        for (int i=1; i<=5; i++){

            for (int j=1; j<=5; j++){

                System.out.print(j);


            }
            System.out.println();

        }
        System.out.println("=============================");


        for (int i=1; i<=5; i++){
            int n =1;


            while (n<=5){
                System.out.print(n);
                n++;
            }
            System.out.println();

        }

    }
}
