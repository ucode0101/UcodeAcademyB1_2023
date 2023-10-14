package day_50_collection_list_and_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice1 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        boolean isAdd =  numbers.add(1);
        System.out.println(isAdd);
        boolean isAdd2 = numbers.add(1);
        System.out.println(isAdd2);
        numbers.add(1);
        numbers.add(2);
        System.out.println("========================");

        // Write a program to find first repeated characters in a string
        Set<String> temp = new HashSet<>();
        String str = "selenium";
        for (String s : str.split("")){
            if (!temp.add(s)){
                System.out.println(s);
                break;
            }
        }


    }
}
