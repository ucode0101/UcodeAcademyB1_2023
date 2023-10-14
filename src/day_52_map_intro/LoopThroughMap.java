package day_52_map_intro;

import java.util.HashMap;
import java.util.Map;

public class LoopThroughMap {

    public static void main(String[] args) {
        Map<Integer, String> map  = new HashMap<>();
        map.put(1, "Java");
        map.put(2,"Selenium");
        map.put(3,"API");

        // Using for each method
        map.forEach( ( key, value ) -> System.out.println(key +" "+value) );

        System.out.println("=============================");

        // Using for each loop to print keys one by one
        for (Integer each : map.keySet()){
            System.out.println(each);
        }

        System.out.println("===================================");

        // Using for each loop to print values one by one
        for (String str : map.values()){
            System.out.println(str);
        }







    }
}
