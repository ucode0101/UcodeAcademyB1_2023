package day_38_oop_inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class EncapsulationTest {

    public static void main(String[] args) {

        ArrayList<String> allNames = new ArrayList<>();
        allNames.addAll(Arrays.asList("Mike","Java","Sara","John"));



        Encapsulation object = new Encapsulation();
        object.setNameList(allNames);

        System.out.println(object.getNameList());



    }
}
