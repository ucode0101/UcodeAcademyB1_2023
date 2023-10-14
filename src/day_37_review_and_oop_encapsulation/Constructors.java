package day_37_review_and_oop_encapsulation;

public class Constructors {



    private String firstName;
    private String lastName;
    private int age;
    private long ssn;

    // This Constructor prevents creating an object outside of this class.
    private Constructors(){

    }

    public Constructors(int num){
        System.out.println(num);
    }

//    public Constructors(String firstName, String lastName, int age, long ssn){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.ssn = ssn;
//        method1();
//        method2(10);
//
//    }


    public String toString(){
        return firstName+" "+lastName+" "+age;
    }

    public void method1(){

        System.out.println("Hello");
    }

    public static int method2(int num){
        return num;
    }





}
