package day_18_nested_loop_arrays_intro;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {



        // Create an int array and assign 5 values to it
        // and print all element one by one

        int [] numbers = new int[5];

        // Assigning values
        numbers[0]= 10;
        numbers[1] = 13;
        numbers[2] = 30;
        numbers[3] = 88;
        numbers[4] = 99;

        // Accessing/printing values
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println("===============================");


        // Arrays.toString(youArrayName here)

        System.out.println(Arrays.toString(numbers));

        System.out.println("============Find array length / number of elements in it==============");

        System.out.println(numbers.length);

        System.out.println("==========Printing numbers as a string from int array===============");

        String str = Arrays.toString(numbers);
        System.out.println(str);



    }
}
