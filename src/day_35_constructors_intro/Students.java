package day_35_constructors_intro;

public class Students {
    String name;
    int age;
    char gender;
    static String university ="U-Code Academy";
    // This is called default constructor
    public Students(){

    }
    public Students(String name){
        this.name =name;
    }
    public Students(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Students(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public String toString(){
        return  "Name: "+name+" Age: "+age+" Gender: "+gender+" University: "+university;
    }

}
