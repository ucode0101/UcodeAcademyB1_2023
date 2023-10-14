package day_52_map_intro;

import java.util.*;

public class MapMethods2 {
    public static void main(String[] args) {

        Map<Double, String> map = new HashMap<>();

        map.put(1.0, "A");
        map.put(2.2, "B");
        map.put(9.9, "C");


        Set<Double> keys =map.keySet();
        System.out.println(keys);

        System.out.println("======================");

        List<String> list = new ArrayList<>(map.values());
        System.out.println(list);

    }
}
