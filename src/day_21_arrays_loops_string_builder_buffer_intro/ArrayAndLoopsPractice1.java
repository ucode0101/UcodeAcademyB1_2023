package day_21_arrays_loops_string_builder_buffer_intro;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndLoopsPractice1 {

    public static void main(String[] args) {

        // Write a program to ask user to enter a number, and store 1 to given number in int array
        //if user enters 5 -> [1,2,3,4,5]

        System.out.println("Please enter a valid number");

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        int [] d1 = new int[x];

        for (int i=0; i< x; i++){

            d1[i] = i+1;


        }

        System.out.println(Arrays.toString(d1));

        System.out.println("===========================================");
        // Write a program to ask user to enter a number, and store 1 to given number in two-dimensional array
        //if user enters 5 -> [[1,2,3,4,5], [1,2,3,4,5]... ]

        int [][] d2 = new int[x][x];

        for (int i=0; i< d2.length; i++){

            for (int j=0; j<d2[i].length; j++){

                d2[i][j] = j+1;

            }
        }
        System.out.println(Arrays.deepToString(d2));

        System.out.println("===========================================================");

        // Write a program to ask user to enter a number, and store 1 to given number in three-dimensional array
        //if user enters 5 -> [[[1,2,3,4,5], [1,2,3,4,5]... ]]
        int [][][] d3 = new int[x][x][x];

        for (int i=0; i< d3.length; i++){

            for (int j=0; j< d3[i].length; j++){

                 for (int k =0; k <d3[i][j].length; k++){

                     d3[i][j][k] = k+1;

                 }


            }

        }

        System.out.println(Arrays.deepToString(d3));




    }
}
