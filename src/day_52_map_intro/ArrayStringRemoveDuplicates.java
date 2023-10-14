package day_52_map_intro;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayStringRemoveDuplicates {
    public static void main(String[] args) {
       // 1. Write a program to remove  duplicates from an Array of String

        String [] strArray = {"abc","abc","aa","aa","bb","bb","cc","cc"};



        Set<String> uniques = new LinkedHashSet<>(Arrays.asList(strArray));


        System.out.println(uniques);

        System.out.println("=====================================");

        strArray = new String[uniques.size()];


        int index =0;
        for (String each : uniques){
            strArray[index] = each;
            index ++;
        }

        System.out.println(Arrays.toString(strArray));

        System.out.println("===================================");

        String [] strArray2 = {"abc","abc","aa","aa","bb","bb","cc","cc"};

        System.out.println(Arrays.toString(removeDuplicates(strArray2)));


    }

    // With Stream API (not our topi/we didn't cover it)
    public static String [] removeDuplicates(String [] arr){

      String [] resul = Arrays.stream(arr).distinct().toArray(String[] :: new);

      return resul;

    }

}
