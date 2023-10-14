package day_51_list_set_continue;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {


        Set<Character> chSet = new TreeSet<>(Arrays.asList('b','d','e','a','c'));
        System.out.println(chSet);


        Set<Character> ch2 = new LinkedHashSet<>(Arrays.asList('b','d','e','a','c'));
        System.out.println(ch2);

        Set<Character> ch3 = new HashSet<>(Arrays.asList('b','w','e','a','c'));
        System.out.println(ch3);

        System.out.println("===========================================");

        Set<String> str1 = new TreeSet<>(Arrays.asList("java","jira","api","selenium"));
        System.out.println(str1);

        Set<String> str2 = new LinkedHashSet<>(Arrays.asList("java","jira","api","selenium"));
        System.out.println(str2);

        Set<String> str3 = new HashSet<>(Arrays.asList("java","jira","api","selenium"));
        System.out.println(str3);


    }
}
