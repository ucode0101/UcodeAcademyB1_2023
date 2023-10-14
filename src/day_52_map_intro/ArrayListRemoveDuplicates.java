package day_52_map_intro;

import java.util.*;

public class ArrayListRemoveDuplicates {
    public static void main(String[] args) {
        //2. Write a program to remove duplicates from an ArrayList of String

        List<String> list = new ArrayList<>(Arrays.asList("aa","aa","bb","bb","cc","dd","cc","dd"));


        Set<String> uniques = new HashSet<>(list);
        System.out.println(uniques);

        System.out.println("=========================================");

        list = new ArrayList<>(uniques);

        System.out.println(list);



    }
}
