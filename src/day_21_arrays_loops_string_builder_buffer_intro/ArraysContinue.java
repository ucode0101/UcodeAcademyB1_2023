package day_21_arrays_loops_string_builder_buffer_intro;

import java.util.Arrays;

public class ArraysContinue {

    public static void main(String[] args) {

        // One-dimensional array/ or you can call array
        int [] d1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(d1));

        // Two-dimensional array
        int  [][] d2 = { {1,2,3,4,5}, {6,7,8,9} };
        System.out.println(Arrays.deepToString(d2));

        System.out.println("============================");

        // Three-dimensional array declaration
        int [][][] d3 = new int[3][3][3]; // length is 3, 3 arrays, 3 elements/values in each array

        d3[0][0][0] = 1;
        System.out.println(Arrays.deepToString(d3));

        System.out.println("================================");
        System.out.println(d3[0][0][0]);

        System.out.println("================================");

        // Three-dimensional array declare and assign value

                                //       0                          1
        int [][][] array3D = { { {1,2,3}, {4,5,6}  },  {{7,8,9,1,22}, {55,54,11,123}} };
                               //  0        1             0               1
        System.out.println(Arrays.deepToString(array3D));
        System.out.println("==================================");

        for (int i=0; i< array3D.length; i++){ // iterate over the length of array

            for (int j =0; j< array3D[i].length; j++){ // iterate over each array

                for (int k=0; k< array3D[i][j].length; k++){ // iterate over each element in each array

                    System.out.print( array3D[i][j][k]+" " );
                }
                System.out.println();

            }

        }














    }
}
