package day_54_java_versions_features;

import java.util.*;

public class WarmUpTask2 {
    public static void main(String[] args) {
        //Task 2:
        //Create an ArrayList<String> called "names" and store 5 different names in it.
        // Create a Map<String, Integer> called "nameLengths" and loop through the list of names,
        // adding each name as a key and its length as the value in the map.

        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Sara","James","Robert","Mike"));

        Map<String, Integer> nameLengths = new HashMap<>();

        for (String eachName : names){
            nameLengths.put(eachName, eachName.length());
        }

        System.out.println(nameLengths);

    }
}
