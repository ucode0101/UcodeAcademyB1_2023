package day_52_map_intro;

import java.util.*;

public class HashTreeLinkedMaps {

    public static void main(String[] args) {

       Map<Integer, Integer> hashMap = new HashMap<>();

       hashMap.put(2,2);
       hashMap.put(1,1);
       hashMap.put(3,3);
       hashMap.put(null, 5);
       hashMap.put(4, null);
       hashMap.put(null, 0);



       System.out.println(hashMap);

        System.out.println("=========================================");
        Map<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(3,3);
        treeMap.put(2,2);
        treeMap.put(1,1);
        treeMap.put(4, null);

        //treeMap.put(null, 6);// It will throw NullPointerException in the run time

        System.out.println(treeMap);

        System.out.println("==============================================");

        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(4,4);
        linkedHashMap.put(1,1);
        linkedHashMap.put(3,3);
        linkedHashMap.put(2,2);
        linkedHashMap.put(null, 5);
        linkedHashMap.put(5, null);
        linkedHashMap.put(null, 7);



        System.out.println(linkedHashMap);

        System.out.println("===========================================");

        Map<Integer, Integer> hashTable = new Hashtable<>();
        hashTable.put(2,2);
        hashTable.put(3,3);
        hashTable.put(1,1);
        //hashTable.put(null, 8); does not allow null key throws NullPointerException
        //hashTable.put(8, null); does not allow null key throws NullPointerException

        System.out.println(hashTable);

        System.out.println("====================================");

        Map<Integer, Integer> addAll = new HashMap<>();
        addAll.putAll(hashMap);

        // assigning a map to another map directly
        Map<Integer, Integer> map = hashMap;

       

    }
}
