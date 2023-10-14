package day_50_collection_list_and_set;

import java.util.*;

public class ListAndSet {
    public static void main(String[] args) {
        // Regular way
        //ArrayList<Character> chList = new ArrayList<>();

        List<Character> chList = new ArrayList<>();
        chList.addAll(Arrays.asList('a','a','b','b','c','c'));

        System.out.println(chList);

        HashSet<Character> chSet = new HashSet<>();
        chSet.addAll(Arrays.asList('b','a','b','c','c','a'));

        System.out.println(chSet);

        System.out.println("===============================================");

        Iterator<Character> iterator1 = chList.iterator();

        System.out.println(iterator1.next());

        Iterator<Character> iterator2 = chSet.iterator();
       // System.out.println(iterator2.next());

        System.out.println("========================================");

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }




    }
}
