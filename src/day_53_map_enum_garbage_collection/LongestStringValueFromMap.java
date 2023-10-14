package day_53_map_enum_garbage_collection;

import java.util.*;

public class LongestStringValueFromMap {

    public static void main(String[] args) {
        //Task 2:
        //Write a program to find the longest string value from Map<Integer,String>

        Map<Integer, String> map = new HashMap<>();

        map.put(33, "Automation");
        map.put(1,"Java");
        map.put(99,"Selenium");


        String longString = "";

        // One way is to store in Set to remove duplicate
        Set<String> set = new HashSet<>(map.values());

        // another way to store in List to include duplicates
        List<String> list = new ArrayList<>(map.values());

        // Or we can directly call map.values() in side the loop

        for (String eachValue : map.values() ){

            if (longString.length() < eachValue.length()){
                longString = eachValue;
            }

        }
        System.out.println(longString);
    }
}
