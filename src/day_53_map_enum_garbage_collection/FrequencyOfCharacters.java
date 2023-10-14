package day_53_map_enum_garbage_collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        // Task 4:
        // Write a program to find frequency of characters in key and value/map format
        // eg: String str = "java" -> {j=1,a=2, v=1}
        // we did it before this way j1a2v1

        // One way of doing it
        String str = "jjaavva"; // -> {j=1,a=2, v=1}
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i< str.length(); i++){
            Character key = str.charAt(i);

            if (!map.containsKey(key)){

                map.put(key, 1);
            } else {
                map.put(key, map.get(key)+1);
            }

        }



        System.out.println(map);

        System.out.println("========================================");


        // Another way of doing it
        Map<Character, Integer> map2 = new LinkedHashMap<>();

        for (int i=0; i< str.length(); i++){
            Character ch = str.charAt(i);

            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        }
        System.out.println(map2);






    }
}
