package day_38_oop_inheritance.task_1;

public class Developer extends Employee{
      /*
    Inherited following fields:
    name
    salary
    id
    jobTitle
     */

    public Developer(String name, double salary, long id, String jobTitle){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
}
