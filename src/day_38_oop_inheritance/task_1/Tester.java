package day_38_oop_inheritance.task_1;

public class Tester extends Employee {
    /*
    Inherited following fields:
    name
    salary
    id
    jobTitle
     */

    public Tester(String name, double salary, long id, String jobTitle){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public void testing(){
        System.out.println(name+" is doing automation testing");
    }


}
