package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysPractice4 {
    public static void main(String[] args) {
        // Write a program to combine 2 arrays into 1

        char [] ch1 = {'a','b','c','d'};
        char [] ch2 = {'e','f','g','h'};

        char [] result = new char[ch1.length + ch2.length];

        for (int i=0; i< ch1.length; i++){
            result[i]= ch1[i]; // we add all elements from ch1 into result
        }

        //System.out.println(Arrays.toString(result));

        for (int i=0; i < ch2.length;i++ ){
            result[ch1.length+i] = ch2[i]; // We add all elements from ch2 into result start at index ch1.length+1

        }
        System.out.println(Arrays.toString(result));



    }
}
