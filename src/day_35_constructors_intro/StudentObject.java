package day_35_constructors_intro;

public class StudentObject {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStudentInfo("Mike Smith",23);
        s1.getStudentInfo();

        Student s2 = new Student();
        s2.setStudentInfo("Sara Jackson", 23);
        s2.getStudentInfo();

    }
}
