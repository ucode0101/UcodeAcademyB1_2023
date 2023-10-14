package day_37_review_and_oop_encapsulation;

public class TestEncapsulation3 {

    public static void main(String[] args) {
        EncapsulationPerson3 person = new EncapsulationPerson3();

        person.setFirstName("Maria");
        person.setLastName("James");
        person.setSsn(55555555);
        System.out.println(person);
    }
}
