package day_54_java_versions_features;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

    public static void main(String[] args) {


        String str = "java";
        int number = 12;
        double dNumber = 3.4;
        boolean b = true;
        int[] intArr = {2,3,45};
        String [] strArr = {"java","api","sql"};
        List<Integer> list = new ArrayList<>();

        // Using var keyword
        var strVar = "java";
        var numVar = 12;
        var doubleVar = 3.4;
        var bVar = true;
        var intArrVar = new int[]{2,3,45};
        var strArrVar = new String[] {"java","api","sql"};

        // we need to provide the data type
        var listVar = new ArrayList<Integer>();
        listVar.add(1);
        listVar.add(55);

        var objVar = new TypeInference();


        System.out.println(strVar.charAt(1));


    }
}
