package day_46_oop_polymorphism_intro;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        // implicit & explicit casting

        double d = 3.4;
        int i = (int) d; // explicit casting

        int b = 12;
        double d2 = b; // implicit casting

        // reference type casting/ up casting & down casting

       ClassA classA = new ClassA();

       ClassB classB = (ClassB) classA; // Down casting

        ClassB obj2 = new ClassB();

        ClassA obj3 = obj2; // done implicitly
    }
}




class ClassA{

}

class ClassB extends ClassA{

}