package day_20_multi_d_array_for_each_loop;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int [] students1 = {1,2,3,4,5};
        int [] students2 ={6,7,8,9,10};

        int[][] arrayOfArrays = new int[3][4];// Two-dimensional array that can hold 3 arrays with length of 4 (each array)

        arrayOfArrays[0][0] = 1;
        arrayOfArrays[1][0] = 10;
        arrayOfArrays[2][0] = 55;

        System.out.println(arrayOfArrays[0][1]);

        System.out.println(arrayOfArrays[1][2]);

        System.out.println(arrayOfArrays[2][0]);

        System.out.println("=======================");

        System.out.println(Arrays.deepToString(arrayOfArrays));

        String str7 = Arrays.deepToString(arrayOfArrays);
        System.out.println(str7);

        System.out.println("=================================");

        int [][] twoDArray = {{1,2,3,4,5,6,7},{4,5,6,5,9}};

        System.out.println("Length of two-d array");
        System.out.println(twoDArray.length);  // it returns the length of two-dimensional array

        System.out.println("Find the length of first array in two-d array");

        System.out.println(twoDArray[0].length); // it returns the length of first array in two-dimensional array


    }
}
