package day_16_nested_for_loop;

public class NestedForLoop {

    public static void main(String[] args) {
        // Write a program to print from 1 to 10


//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }
        // Write a program to print from 1 to 10 5 times;

        for (int i =1; i<=5; i++){ // if the condition is ture

            for (int j=1; j<=10; j++){ // inner loop starts running from 1 to 10
                System.out.println(j);
            }
            System.out.println("======================================");


        }
    }
}
