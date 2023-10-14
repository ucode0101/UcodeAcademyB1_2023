package day_38_oop_inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {
        // HAS A relationship
        Student s1 = new Student("Sara", 77);
        Student s2 = new Student("John", 67);
        Student s3 = new Student("Sofia", 44);

        ArrayList<Student> allStudents = new ArrayList<>(Arrays.asList(s1, s2, s3));

        Student obj = new Student();
        obj.setStudentList(allStudents);

        for (Student eachStudent : obj.getStudentList()){

            System.out.println(eachStudent.getName()+" "+eachStudent.getAge());
        }




    }
}
