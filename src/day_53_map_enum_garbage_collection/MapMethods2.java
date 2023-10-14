package day_53_map_enum_garbage_collection;

import java.util.HashMap;
import java.util.Map;

public class MapMethods2 {
    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(23, 'A');
        map.put(99, 'C');
        map.put(12,'O');
        map.put(54, 'P');
        map.put(77, null);


        // One of the way to check if map contains the key before adding
        // is to use if statement. Using if only checks the key

        if (!map.containsKey(23)){
            map.put(23, 'X');

        }
        System.out.println(map);

        System.out.println("================================================");

        // this will not add, because key associated with a value/ key has value
       map.putIfAbsent(54,'Z');

        System.out.println(map);

        System.out.println("=============================================");

        map.putIfAbsent(77, 'Y');

        System.out.println(map);


    }
}
