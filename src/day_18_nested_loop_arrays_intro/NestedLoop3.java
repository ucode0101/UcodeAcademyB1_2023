package day_18_nested_loop_arrays_intro;

public class NestedLoop3 {

    public static void main(String[] args) {

        // Task:
        // Print from 1 to 5 five times

        System.out.println("============Do While loop with While loop");

        int i =1;

        do {
            int j =1;

            while (j<=5){
                System.out.print(j);
                j++;
            }
            System.out.println();

            i++;



        }  while (i<=5);


        System.out.println("=================do while with for loop====================");

        int k =1;


        do {

            for (int x =1; x <=5; x++){
                System.out.print(x);
            }
            System.out.println();

            k++;


        } while (k<=5);











    }
}
