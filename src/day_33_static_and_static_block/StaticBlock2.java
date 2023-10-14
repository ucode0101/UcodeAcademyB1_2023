package day_33_static_and_static_block;

public class StaticBlock2 {

    public static void main(String[] args) {


    }

     static int a;
     static int b;

    static {
       int abc;
        a = 100;
        b = 200;

        if (a > b){
            a = 100;

        } else{
            b = 100;
        }
        System.out.println("A is: "+a +" B is: "+ b);
        Student student = new Student();
        student.setInfo("Some Name",444);
        System.out.println(student);
        student.displaySchoolName();

    }


}
