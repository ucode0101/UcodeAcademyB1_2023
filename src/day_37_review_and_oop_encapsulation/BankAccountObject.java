package day_37_review_and_oop_encapsulation;

public class BankAccountObject {

    public static void main(String[] args) {
        BankAccount person1 = new BankAccount(1234567, 88887777);
        person1.firstName ="Mike";
        person1.lastName = "James";
        person1.email = "test@test.com";
        person1.setBalance(200.00);
        person1.setPinCode(9999);

        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.email);
        System.out.println(person1.getSsn());
        System.out.println(person1.getAccountNumber());
        System.out.println(person1.getBalance());
        System.out.println(person1.getPinCode());


    }
}
