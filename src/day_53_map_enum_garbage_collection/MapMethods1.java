package day_53_map_enum_garbage_collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods1 {
    public static void main(String[] args) {

        Map<Integer, Integer> map1 = new TreeMap<>();
        map1.put(1,1);
        map1.put(2,2);

        Map<Integer,Integer> map2 = new LinkedHashMap<>();
        map2.put(2,2);
        map2.put(1,1);



       boolean b1 = map1.equals(map2);
        System.out.println(b1);

        System.out.println("=========================================");

        Map<Integer, String> map3 = new HashMap<>();

        map3.put(11, "Java");
        map3.put(34,"Selenium");
        map3.put(19, "API");


        // to replace/override existing key with new value
        map3.replace(34,"TestNG");

        System.out.println(map3);

        System.out.println("=====================================");


        // This method is used to replace old value with new value for the matching key
        map3.replace(19,"API","JUnit");

        System.out.println(map3);






    }
}
