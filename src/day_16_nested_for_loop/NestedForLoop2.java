package day_16_nested_for_loop;

public class NestedForLoop2 {
    public static void main(String[] args) {

        // Task:
        // Print some stars (*) using nested for loop

        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=========================");

        // Task 2:
        // Write a program to reverse  a string 5 times

        String str ="java";

        for (int i=0; i< str.length(); i++){

            for (int j=str.length()-1; j>=0; j--){

                System.out.print(str.charAt(j));
            }
            System.out.println();

        }
    }
}
