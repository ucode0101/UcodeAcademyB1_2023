package day_38_oop_inheritance;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private ArrayList<Student> studentList;

    public Student(){

    }

    public void setStudentList(ArrayList<Student> studentList){
        this.studentList = studentList;
    }


    public Student(String name, int age ){
        this.name = name;
        this.age = age;

    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }









}
