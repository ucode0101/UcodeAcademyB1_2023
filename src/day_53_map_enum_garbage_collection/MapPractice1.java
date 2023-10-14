package day_53_map_enum_garbage_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPractice1 {

    public static void main(String[] args) {
        // Task 3:
        // Write a program to remove key and value from the map for any String key that
        // has length of 10 or more

        Map<String, Integer> map = new HashMap<>();

        map.put("StringAndJava",1);
        map.put("Automation",45);
        map.put("TestingAnd", 89);
        map.put("Java",33);
        map.put("Selenium",12);

        System.out.println(map);

        System.out.println("===========================");


        Set<String> set = new HashSet<>(map.keySet());

        // Loop through and remove string length() >=10
        for (String key : set){
            if (key.length() >=10){
                map.remove(key);
            }
        }
        System.out.println(map);

    }
}
