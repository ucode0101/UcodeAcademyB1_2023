package office_hours.day_03_class_object_review;

public class ChaseBank2 {
    public static void main(String[] args) {

        BankAccount2 person1 = new BankAccount2();
        person1.openNewAccount("Tom Ford", 123456, 500, 1212);

        person1.checkBalance(1212);

        System.out.println("==============================================");

        person1.deposit(1212,200);

        System.out.println("===========================================");

        person1.withdraw(1212, 100);

        System.out.println("===============================================");

        BankAccount2 person2 = new BankAccount2();

        person2.openNewAccount("Sara James", 12222, 400, 2323);

        person2.getCustomerInfo(2323);

        System.out.println("==============================================");

        person2.closeAccount(2323);

        System.out.println("=========================================================");
        person2.getCustomerInfo(2323);

        System.out.println("===========================================================");

        BankAccount2 person3 = new BankAccount2();
        person3.deposit(9090, 3000);

        System.out.println("================================");
        person3.closeAccount(1111);

        System.out.println("=======================================");
        person3.checkBalance(9090);

    }
}
