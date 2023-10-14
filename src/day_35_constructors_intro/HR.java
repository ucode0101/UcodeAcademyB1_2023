package day_35_constructors_intro;

public class HR {

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();


    public static void main(String[] args) {


        employee1.getEmpInfo();
        employee2.getEmpInfo();
        employee3.getEmpInfo();
    }

    static {
        employee1.setEmpInfo("James Bond","SDET");
        employee2.setEmpInfo("Maria James","SDET");
        employee3.setEmpInfo("John Robert", "QA Engineer");
    }
}
