package day_19_arrays_continue;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysPractice3 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4};
        int [] arr2 ={1,2,3,4};

        boolean b = Arrays.equals(arr1,arr2);
        System.out.println(b);
        System.out.println("==========================");

        String str1[] ={"java","selenium","api","hi","i"};
        String [] str2 = {"java","selenium","api","hi"};

        System.out.println(Arrays.equals(str1,str2));
        System.out.println("================================");

        //Arrays.sort(str1, Comparator.comparing(String::length));
        //System.out.println(Arrays.toString(str1));






    }
}
