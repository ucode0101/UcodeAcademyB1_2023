package day_18_nested_loop_arrays_intro;

public class NestedLoop2 {

    public static void main(String[] args) {
        // Task
        // Write a program to print from 1 to 5 five times
        System.out.println("======While loop with for loop====");

        int i=1;

        while (i <=5){

            for (int j=1; j<=5; j++){

                System.out.print(j);
            }
            System.out.println();
            i++;
        }

        System.out.println("============While loop with Do While Loop=========================");

        int x =1;

       while (x <=5){
           int y =1;

           do {
               System.out.print(y);
               y++;
           } while (y <=5);

           x++;
           System.out.println();

       }


    }
}
