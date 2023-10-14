package day_18_nested_loop_arrays_intro;

import java.util.Arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {
        // create an array and store 5 student name

        String [] students = {"Mike", "Jake", "Ross","David","Smith"};

        System.out.println(students[0]);
        System.out.println("=================================");

        System.out.println(Arrays.toString(students));

        System.out.println("===============================");

        students[1] = "Paul"; // Assigning a new value/element
        System.out.println(Arrays.toString(students));


    }
}
