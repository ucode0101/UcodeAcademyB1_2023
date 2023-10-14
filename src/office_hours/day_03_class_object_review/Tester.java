package office_hours.day_03_class_object_review;

public class Tester {

    String fullName;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String fullName, long employeeID, String jobTitle, double salary){
        this.fullName = fullName;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public String toString(){
        return "Full Nane: "+fullName+" Job Title: "+jobTitle+" Employee ID:"+employeeID+" Salary: $"+salary;
    }


}
