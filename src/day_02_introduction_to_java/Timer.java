package day_02_introduction_to_java;

import java.util.Scanner;

public class Timer {


    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes = scan.nextInt();

        for (int i = minutes; i > 0; --i) { // the outer loop controls the iteration



            for (int z = 59; z >= 0; --z) {
                int temp =30;

                System.out.println((i - 1) + " minutes and " + z + " seconds left");
                Thread.sleep(1000); // this line stops the code for 1 second
            }

        }



        System.out.println("*** Time is Up! *** ");

    }


}


