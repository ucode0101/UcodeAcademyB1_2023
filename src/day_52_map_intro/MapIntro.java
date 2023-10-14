package day_52_map_intro;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

    public static void main(String[] args) {

        // Creating an object from HashMap()
        //HashMap<Integer, String> map = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(2, 200);

        System.out.println(map.get(1));
        System.out.println(map.get(2));

        System.out.println(map.get(10));

        System.out.println(map.size());

        System.out.println("Print map directly");
        System.out.println(map);

        System.out.println("===========================================================");


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 20);
        map2.put("b",50);

        System.out.println(map2.get("a"));
        System.out.println(map2.get("b"));
        System.out.println("Printing map2 directly");
        System.out.println(map2);

        System.out.println("====================================");


        Map<Character, Boolean> map3 = new HashMap<>();
        map3.put('A', true);
        map3.put('B',false);

        System.out.println(map3);







    }
}
