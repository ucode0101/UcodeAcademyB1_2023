package day_53_map_enum_garbage_collection;

import java.util.*;

public class FindSumOfKeysFromMap {

    public static void main(String[] args) {
        // Task 1:
        //Write a program to find sum of all keys from Map<Integer,String>

        Map<Integer, String> map = new HashMap<>();
        map.put(29, "Java");
        map.put(51, "Selenium");
        map.put(20,"API" );
        map.put(15,"TestNG");

       int sumOfAllKeys = 0;

       // One way of getting all keys from the map and store in Set
        Set<Integer> set = map.keySet();

        // another way of getting all keys from the map and store in Set
        Set<Integer> set2 = new HashSet<>(map.keySet());

        // another way of getting all keys from the map and store in List
        List<Integer> list = new ArrayList<>(map.keySet());

        // Or we can directly get keySet() in loop
        for (int eacKey : map.keySet()){
            sumOfAllKeys += eacKey;
        }

        System.out.println(sumOfAllKeys);


    }
}
