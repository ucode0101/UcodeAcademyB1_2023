package day_51_list_set_continue;

import java.util.*;

public class SetMethods {
    public static void main(String[] args) {
        Set<Integer> num1 = new TreeSet<>(Arrays.asList(3,5,1,4,2));

        Set<Integer> num2 = new HashSet<>(Arrays.asList(1,2,3,4,5));

        Set<Integer> num3 = new LinkedHashSet<>(Arrays.asList(4,1,3,5,2));

        System.out.println(num1.equals(num2));
        System.out.println(num2.equals(num3));

        num3.clear();
        System.out.println(num3);

        List<Integer> num4 = new ArrayList<>(Arrays.asList(1,23,4,5,5));
        num4.clear();
        System.out.println(num4);

        System.out.println("================================");

        System.out.println(num3.isEmpty());
        System.out.println(num4.isEmpty());

        System.out.println(num1.isEmpty());

        Object [] objects = num1.toArray();
        Object [] objects2 = num4.toArray();

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(objects2));

    }
}
