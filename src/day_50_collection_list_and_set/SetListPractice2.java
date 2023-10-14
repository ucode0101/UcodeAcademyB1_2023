package day_50_collection_list_and_set;

import java.util.*;

public class SetListPractice2 {

    public static void main(String[] args) {
         // Write a program to remove duplicate and sort elements in ArrayList

        List<Integer> list = new ArrayList<>(Arrays.asList(8,4,1,3,3,7,2,8,9,6,5,4,5,6,7,2,3,3,2));

        // Remove duplicate and sort it
        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);



        System.out.println("======================================");

        list = new ArrayList<>(set);
        System.out.println(list);
    }
}
