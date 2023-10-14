package day_35_constructors_intro;

public class Employee {
    String name;
    String jobTitle;
    static String company = "Google";

    public void setEmpInfo(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }
    public void getEmpInfo(){
        System.out.println(name+" "+jobTitle+" "+company);
    }
}
