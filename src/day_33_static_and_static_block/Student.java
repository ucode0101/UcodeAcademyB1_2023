package day_33_static_and_static_block;

public class Student {
    String fullName;
    int studentId;
    static String school = "U-Code Academy";

    public void setInfo(String fullName, int studentId){
        this.fullName = fullName;
        this.studentId = studentId;
    }
    public String toString(){
        return fullName+" "+studentId+" "+school;
    }

    public void displaySchoolName(){
        System.out.println(school); // Can call static variable directly
        //displaySchoolName2();      // Can call static method directly
    }
    public static void displaySchoolName2(){
//
//      // displaySchoolName(); Can Not call instance method directly
//       // fullName ="Abc";  Can Not call instance variable directly
      System.out.println(school);
//
  }
}
