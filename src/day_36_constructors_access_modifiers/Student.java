package day_36_constructors_access_modifiers;

public class Student {

    String name;
    int studentId;
    String university;

    public Student(){


        System.out.println("I'm default constructor, I get invoked when Student class object is created");
    }

    {

        System.out.println("I am Instance block, and I get executed every time an object is created");


    }
    static {
        System.out.println("I'm static block");
    }

    public static void main(String[] args) {
//        Student student1 = new Student();
//        System.out.println("===========================");
//        Student student2 = new Student();
    }





}
