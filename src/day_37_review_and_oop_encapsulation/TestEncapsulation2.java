package day_37_review_and_oop_encapsulation;

public class TestEncapsulation2 {

    public static void main(String[] args) {

        EncapsulationPerson2 person = new EncapsulationPerson2("James","Bond", 987654321);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getSsn());


    }
}
