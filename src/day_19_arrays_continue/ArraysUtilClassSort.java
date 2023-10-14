package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysUtilClassSort {
    public static void main(String[] args) {

        int [] nums = {4,3,2,6,7,1,5};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); // It just sorts the array in ascending order
        System.out.println("Print array after sorting");
        System.out.println(Arrays.toString(nums));

        System.out.println("=================================");
        String str [] = {"java","hello","hi","bye"};

        System.out.println("before sorting");
        System.out.println(Arrays.toString(str));

        Arrays.sort(str);
        System.out.println("Printing str array after sorting");
        System.out.println(Arrays.toString(str));

        char [] chars = {'d','c','a','e'};
        System.out.println("Printing before sort");
        System.out.println(Arrays.toString(chars));

        Arrays.sort(chars);
        System.out.println("Printing after sort");
        System.out.println(Arrays.toString(chars));


    }
}
