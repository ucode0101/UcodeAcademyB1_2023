package day_50_collection_list_and_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice2 {
    public static void main(String[] args) {
        Set<Character> characters = new HashSet<>();
        // to add multiple element/items at the same time
        characters.addAll(Arrays.asList('a','b','c','d'));

        // to check if it contains all elements
        boolean b1 = characters.containsAll(Arrays.asList('a','b','c','d','e'));
        System.out.println(b1);

        System.out.println(characters);
        // remove b from set
        characters.remove('b');

        System.out.println(characters);

        // with Stream API (advance java)
        // this is not our topic
        //Character [] ch = characters.stream().toArray(Character[]::new  );
        //Character [] ch = characters.toArray(new Character[0]);
    }
}
