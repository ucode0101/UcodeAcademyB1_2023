package day_19_arrays_continue;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {
        // Write a program to replace all 'a' with 'b' in char array

        char [] chars = {'a','c','a','e','a','b','a','d'};

        System.out.println("Before replacing 'a' with 'b'");
        System.out.println(Arrays.toString(chars));


        int i=0;

       while (i <chars.length){

           if (chars[i] =='a'){
               chars[i] = 'b';
           }
           i++;
       }
        System.out.println("After replacing 'a' with 'b' ");
        System.out.println(Arrays.toString(chars));

    }
}
