package day_19_arrays_continue;

import java.util.Arrays;

public class ArrayPracticeSplitMethod {

    public static void main(String[] args) {

        String str ="java and api and selenium and sql";

        char c = str.charAt(str.length()-1); // it will always take the last character from the string

        String [] strArray = str.split(" ");
        System.out.println(Arrays.toString(strArray));
        //System.out.println(strArray[2]);

        System.out.println("=============================");

        char [] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));






    }
}
