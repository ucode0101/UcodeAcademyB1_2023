package day_52_map_intro;

import java.util.HashMap;

public class MapMethods1 {
    public static void main(String[] args) {

        HashMap<Integer, Character> map = new HashMap<>();

        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3,'w');
        map.put(3, 'c');
        System.out.println(map);
        map.put(3, 'y');
        map.put(4, 'a');
        map.put(5, 'a');

        // remove(); it returns the value and removes it
        char ch = map.remove(1);
        System.out.println(ch);

        System.out.println("=============================");

        System.out.println(map);


        boolean b = map.containsKey(2);
        System.out.println(b);

        System.out.println("==========================");

        boolean b2 = map.containsValue('w');
        System.out.println(b2);




    }
}
