package day_38_oop_inheritance.task_1;

public class BusinessAnalyst extends Employee{

       /*
    Inherited following fields:
    name
    salary
    id
    jobTitle
     */

    public BusinessAnalyst(String name, double salary, long id, String jobTitle){
        this.name =name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public void writingReq(){
        System.out.println(name+" is writing requirements");
    }

}
