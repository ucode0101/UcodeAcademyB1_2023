package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {
        // Write a program to find min and max number from int array
        int [] nums = {3,1,8,5,2,4,6,9,8};

        Arrays.sort(nums); // we sorted in ascending 1,2,3,..

        //int lastIndex = nums.length-1;

        int min =nums[0];
        int max =nums[nums.length-1];

        System.out.println(min);
        System.out.println(max);

    }
}
