package day_51_list_set_continue;

import java.util.*;
import java.util.function.Predicate;

public class SetAndListPractice {
    public static void main(String[] args) {

        // Task 1:
        // remove all even numbers from set using iterator

        Set<Integer> set = new HashSet<>(Arrays.asList(3,1,5,6,7,88,3,4,12,11));

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            Integer x = iterator.next();

            if (x % 2 ==0){
                iterator.remove();
            }

        }
        System.out.println(set);

        System.out.println("===============================================");

        // Task 2:
        // Remove all even numbers using removeIf(), using lambda expression

        Set<Integer> set2 = new TreeSet<>(Arrays.asList(4,66,3,21,44,5,7,89,90,24));
        // Creating predicate          lambda expression
        Predicate<Integer> predicate = x -> x % 2 == 0;

        set2.removeIf(predicate);
        System.out.println(set2);

        System.out.println("===============================");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,5,6,7));

        set.remove(1);
        System.out.println(set);

        list.remove(1);

        System.out.println(list);
        Integer x = 7;
        list.remove(x);

        System.out.println(list);

        list.add(1,89);
        System.out.println(list);




    }
}
