package day_49_collection_intro;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        System.out.println(list1.get(0));
        list1.addAll(Arrays.asList(1,2,3,4));
        list1.set(0,99);
        System.out.println(list1.get(0));

        List<Integer> list2 = new  LinkedList<>();
        list2.add(2);
        System.out.println(list2.get(0));
        list2.addAll(Arrays.asList(1,2,4,5));

        List<Integer> list3 = new Vector<>();
        list3.add(3);
        System.out.println(list3.get(0));
        list3.addAll(Arrays.asList(2,3,4,5,6));
        System.out.println(list3);

        List<Integer> list4 = new Stack<>();
        list4.add(4);
        System.out.println(list4.get(0));
        list4.addAll(Arrays.asList(1,2,3,4));


    }
}
