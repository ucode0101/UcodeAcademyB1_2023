package office_hours.day_03_class_object_review;

public class ChaseBank {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount();

        person1.fullName = "James Bond";
        person1.accountNumber = 123456;
        person1.balance = 500.50;

        System.out.println(person1.balance);

        System.out.println("===============================");

        person1.deposit(45.50);

        System.out.println("===============================");

        person1.withdraw(6);

        System.out.println("===============================");

        System.out.println(person1);

        System.out.println("Checking the balance: ");
        person1.checkBalance();

        System.out.println("===============================");


        BankAccount person2 = new BankAccount();

        person2.setInfo("Mike Smith", 54321, 400);

        System.out.println(person2);




    }
}
