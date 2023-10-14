package day_23_custom_method_continue;

import java.util.Arrays;

public class CustomMethodReturnType2 {

    public static void main(String[] args) {

        String str = "Java";

        str = reverseString(str);

        System.out.println(str);

        System.out.println("=============================");

        int [] nums = {1,3,7,66,2,1,34,5,6,7};

        nums = reverseArray(nums);

        System.out.println(Arrays.toString(nums));

        //System.out.println(Arrays.toString(reverseArray(nums)));

    }

    // This method takes String as argument/parameter, and return string in reverse
    public static String reverseString(String str){

       StringBuilder stringBuilder = new StringBuilder(str);
       String rs = stringBuilder.reverse().toString();


        return  rs;
    }

    // This method take int array as argument/parameter, and return int array in reverse order
    public static int [] reverseArray(int [] arr){

        int [] result = new int[arr.length];
        int c =0;


        for (int i=arr.length-1; i>=0; i--){

            result[c] = arr[i];
            c++;
        }

        System.out.println("Hello");
        return result;
    }



}
