package day_35_constructors_intro;

public class Student {
    String name;
    int age;
    static String university = "U-Code Academy";

    public void setStudentInfo(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void getStudentInfo(){
        System.out.println(name+" "+age+" "+university);
    }
    {

        System.out.println("When you see me an object of Student Class was clreated");
    }
}
