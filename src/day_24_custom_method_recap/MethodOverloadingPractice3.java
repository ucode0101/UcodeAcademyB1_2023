package day_24_custom_method_recap;

import java.util.Arrays;

public class MethodOverloadingPractice3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        String [] s ={"SQL","Java","API"};

        System.out.println(Arrays.toString(getElementAtGivenIndex(arr,12)));

        System.out.println("======================================");

        System.out.println(Arrays.toString(getElementAtGivenIndex(s, 5)));
    }

    // write/create overload method that take array and a number as an index and returns
    // element at given index as array, if not found return empty array

    public static int [] getElementAtGivenIndex(int [] arr, int index){
       // int [] b = new int[1];

        if (index <arr.length){
            int a = arr[index];

            return new int[]{a};
        }
        return new int[]{};

    }

    public static String [] getElementAtGivenIndex(String [] arr, int index){

        if (index < arr.length){
            String s = arr[index];

            return new String[]{s};
        }
        return new String[]{};
    }


}
