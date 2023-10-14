package day_50_collection_list_and_set;

import java.util.*;

public class SetListPractice {

    public static void main(String[] args) {
        // Write a program to remove all duplicate from List (ArrayList);
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1,2,3,3,4,1,3,5,5,6,6));
        // one is to create another ArrayList and use contains() method in your logic

        list = removeDuplicate(list);
        System.out.println(list);

        System.out.println("=====================================");

        // All duplicate are remove/set does not take duplicate
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        list = new ArrayList<>(set);
        System.out.println(list);


    }

    // Write a method tha removes duplicate from ArrayList
    public static ArrayList<Integer> removeDuplicate(List<Integer> list){
        // To remove all duplicate
        //Set<Integer> set = new HashSet<>(list);
        //ArrayList<Integer> abc = new ArrayList<>(set);

        //return abc;
        return new ArrayList<>(new HashSet<>(list));
    }

}
