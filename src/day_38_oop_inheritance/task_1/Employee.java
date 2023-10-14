package day_38_oop_inheritance.task_1;

public class Employee {

    protected String name;
    protected double salary;
    protected long id;
    protected String jobTitle;

    public String toString(){
        return "Name: "+name+"\nSalary: $"+salary+"\nID: "+id+"\nJob Title: "+jobTitle;
    }
}
