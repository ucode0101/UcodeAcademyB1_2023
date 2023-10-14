package day_20_multi_d_array_for_each_loop;

public class NestedForEachLoop {
    public static void main(String[] args) {
        // Task:
        // Write a program to print each element for each array from two-dimensional array

        int [][] nums = { {1,2,3,4}, {5,6,7}, {8,9,10,11,12,13} };

        for (int [] i : nums){

            for (int j : i){

                System.out.print(j+" ");
            }
            System.out.println();

        }

    }
}
