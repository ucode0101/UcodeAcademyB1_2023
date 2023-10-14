package day_18_nested_loop_arrays_intro;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        // Create a String array and store 5 student names
        // And create a string and store/assign all those names from array

        String [] students = new String[5];
        students[0] = "Mike";
        students[1] = "James";
        students[2] = "Smith";
        students[3] = "David";
        students[4] = "Ross";

        String allNames = students[0]+students[1]+students[2]+students[3]+students[4];

        System.out.println(allNames);
        System.out.println("=========================");
        String names = Arrays.toString(students);

        System.out.println(names);

        System.out.println("======================================");

        String randomName = students[3];
        System.out.println(randomName);

        System.out.println("Printing array as string");
        System.out.println(Arrays.toString(students));






    }
}
