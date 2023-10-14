package day_19_arrays_continue;

import java.util.Arrays;

public class ArrayPracticeToCharArrayMethod {
    public static void main(String[] args) {

        String str ="java";

//        char [] charArray;
//        charArray = new char[5];

        char [] charArrays = {'a','b','c','d'};
        System.out.println(Arrays.toString(charArrays));

        System.out.println("=================================");

        char [] chArray = str.toCharArray();

        System.out.println(Arrays.toString(chArray));

        System.out.println(chArray[0]);



    }
}
