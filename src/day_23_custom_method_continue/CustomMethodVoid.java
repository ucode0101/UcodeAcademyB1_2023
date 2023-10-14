package day_23_custom_method_continue;

import java.util.Arrays;

public class CustomMethodVoid {
    public static void main(String[] args) {

        String s = "java";
        // int a = s.length();

        reverseString(s);
        reverseString("selenium");
        reverseString("API");



        System.out.println("================================");
        int [] nums = {1,2,32,5,3,77,6,5,11};
        reverseArray(nums);

        System.out.println("=====================================");
        multiParameterMethod(12, 'c',"str",nums);

    }

    public static void reverseString(String str){

         String reverse ="";
//        for (int i= str.length()-1; i>=0; i--){
//            reverse += str.charAt(i);
//        }
//        System.out.println(reverse);
        reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);


    }

    public static void reverseArray(int [] arr){

        int [] re = new int[arr.length];
        int index = 0;

        for (int i= arr.length-1; i>=0; i--){

            re[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(re));
    }

    // Void method with multiple parameters
    public static void multiParameterMethod(int num, char ch, String str, int [] arr){

        System.out.println("Num: "+num);
        System.out.println("Char: "+ch);
        System.out.println("String: "+str);
        System.out.println("Array: "+ Arrays.toString(arr));

    }
}
