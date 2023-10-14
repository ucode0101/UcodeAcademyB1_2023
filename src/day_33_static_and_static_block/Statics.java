package day_33_static_and_static_block;

import java.util.Collections;

//Static methods can not access instance methods and instance variables directly

public class Statics {
    String name1; // Belongs to object/instance.
    static String name2; // Belongs to Class, and one copy is shared by all objects/instances

    public void setName(){
        name1 = "Name1";
        name2 = "Name2";
        setName2();
    }

    public static void setName2(){
        //name1 = "abc";
        name2 = "Test";
        ///setName();
    }

    public static void main(String[] args) {
        int a = MathUtilClass.sum(20, 20); // Calling static method from MathUtilClass

        String  str = new String("abc");
        //str.substring(0,1) // This is instance method

        //str = String.valueOf() // This is static method



    }
}
