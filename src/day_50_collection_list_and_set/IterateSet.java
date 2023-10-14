package day_50_collection_list_and_set;

import java.util.*;

public class IterateSet {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.addAll(Arrays.asList("Toyota","BMW","Audi","Honda"));

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator.remove();
        }
        System.out.println("=========================");


        List<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1,2,3,4,5,6));

        ListIterator<Integer> iterator2 = num.listIterator();

        while (iterator2.hasNext()){
            iterator2.next();
        }



       // Reverse num

        while (iterator2.hasPrevious()){
            System.out.println(iterator2.previous());
        }
    }
}
