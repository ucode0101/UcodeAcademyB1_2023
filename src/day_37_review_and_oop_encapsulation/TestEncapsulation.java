package day_37_review_and_oop_encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {

        EncapsulationPerson person = new EncapsulationPerson();

        //person.name = "Mike"; // has private access modify/encapsulated

        person.setName("Mike");
        System.out.println(person.getName());

        person.setAge(42);
        System.out.println(person.getAge());
        person.email ="test@test.com";
        System.out.println(person.email);



    }
}
