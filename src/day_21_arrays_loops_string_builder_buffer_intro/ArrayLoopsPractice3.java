package day_21_arrays_loops_string_builder_buffer_intro;

import java.util.Arrays;

public class ArrayLoopsPractice3 {

    public static void main(String[] args) {

         // Task 1:
        // Write a program to sort int array ascending

        int [] d1 = { 5,2,4,1,6,3,7};
       // Arrays.sort(d1);
        System.out.println(Arrays.toString(d1));
        System.out.println("=======================");

        // Task 2:
        // Write a program to sort int array ascending without using sort method
        String str2 ="asc";

        for (int i=0; i< d1.length; i++){

            for (int j=i; j< d1.length; j++){

                if (d1[i] > d1[j]){
                    int temp = d1[i];  // we store element/value from index to temp variable
                    d1[i] = d1[j];   // we assign element from index j to index as new value
                    d1[j] = temp;  // we assign temp variable to index j

                }
            }

        }
        System.out.println("After sorting ");
        System.out.println(Arrays.toString(d1));

        // Swap this numbers
        int a = 5;
        int b = 2;

        int temp = a;
        a = b;
        b = temp;
        System.out.println("A: "+a+"\nB: "+b);

        // Task 3:
        // Write a program to sort string in alphabetical order
        // example ["cab"] -> ["abc"]

        String [] str = {"cab","java","fde","selenium","zywpdre"};

        for (int i=0; i<str.length; i++){

            char [] ch = str[i].toCharArray(); // convert to char array
            Arrays.sort(ch);
            ///str[i] = new String(ch);

            String s = new String(ch); // it is good to avoid confusion
            str[i] = s;


        }

        System.out.println("after sorting string array in alphabetical order (place)");
        System.out.println(Arrays.toString(str));

        // Write a program to sort in array in ascending or descending order base on condition

        // if string is ascending sort in ascending order if else sort in descending order



    }
}
