package day_33_static_and_static_block;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Mike Smith", 123);
        System.out.println(student1);
        student1.displaySchoolName();

        //student1.displaySchoolName2();
        //Student.displaySchoolName2();

        System.out.println("=====================");
        Student student2 = new Student();
        student2.setInfo("Sara Mike",111);

        student2.displaySchoolName();
        student2.school = "ABC School";

        System.out.println("=======================");
        student1.displaySchoolName();

        System.out.println("=================================");
        System.out.println(Student.school);
       // Student.displaySchoolName2();


    }
}
