package day_38_oop_inheritance;

import java.util.ArrayList;

public class Encapsulation {

    // This is encapsulated/private ArrayList<String>
    private ArrayList<String> nameList;

    // This is instance method, we call it setter method in Encapsulation
    public void setNameList(ArrayList<String> nameList){
        this.nameList = nameList;

    }



    public ArrayList<String> getNameList(){
        return nameList;
    }


}
