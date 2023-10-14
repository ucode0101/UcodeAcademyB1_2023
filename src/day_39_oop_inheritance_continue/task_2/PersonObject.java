package day_39_oop_inheritance_continue.task_2;

public class PersonObject extends Person {


    // This constructor is used to call parent/super class's constructor
    public PersonObject(){
        super(); // this keyword is used to call super/parent class's constructor
    }

    public void speak(){

        super.talk();
    }


    public static void main(String[] args) {

        PersonObject object = new PersonObject();
        object.name = "Java";
        object.speak();


    }

}
