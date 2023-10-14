package day_52_map_intro;

import java.util.HashMap;
import java.util.Map;

public class MapEntrySet {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("a",100);
        map.put("b",300);
        map.put("x", 290);

        System.out.println(map.isEmpty());


        System.out.println("=======================================");

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());

        }

        System.out.println("===============================");

        System.out.println(map);

        map.clear();

        System.out.println(map);

    }
}
