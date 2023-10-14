package day_20_multi_d_array_for_each_loop;

import java.util.Arrays;

public class TwoDimensionalArrayAndNestedLoop {
    public static void main(String[] args) {

        // Task 1:
        // Create two-dimensional array any length and print all elements from each array

        char [][] chars = { {'a','b','c'}, {'d','e','f','g','h'}, {'i','j','k','l','m','n','o'} };

        for (int i=0; i<chars.length; i++){  // i is 0 -> c

            for (int j=0; j<chars[i].length; j++){ // chars[i] i is 0 -> first array is at index 0

                System.out.print(chars[i][j]);  // chars[2][1]
            }
            System.out.println();
        }

        System.out.println("==========================================");

        String [][] strArray = { {"java", "api","selenium"}, {"testng","junit","rest assured","maven"}, {"sdle","stlc","testing"} };

        System.out.println(Arrays.deepToString(strArray));

        System.out.println("Printing each element from two d array");

        int i =0;

        while (i <strArray.length){
            int j =0;

            while (j < strArray[i].length){
                System.out.print(strArray[i][j]+" ");
                j++;
            }
            i++;
            System.out.println();
        }




    }
}
