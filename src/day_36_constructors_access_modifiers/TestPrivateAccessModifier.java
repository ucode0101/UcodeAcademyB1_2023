package day_36_constructors_access_modifiers;

import day_36_constructors_access_modifiers.AccessModifiers;

public class TestPrivateAccessModifier {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        //obj.name4 // this instance variable has private access modifier, so it's not accessible outside of class
         //obj.method4(); //this instance method has private access modifier, so it's not accessible outside of class

        // All other instance variables and methods can be accessed from this, because they in the same package

    }
}
