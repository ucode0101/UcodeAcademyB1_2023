package day_47_oop_polymorphism_continue;

public class ObjectAB {
    public static void main(String[] args) {
        ClassA obj = new ClassB();

        obj.method1();
        System.out.println(obj instanceof ClassA);
        System.out.println(obj instanceof ClassB);
    }
}
