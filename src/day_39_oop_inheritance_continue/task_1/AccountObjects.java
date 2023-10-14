package day_39_oop_inheritance_continue.task_1;

public class AccountObjects {

    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.accountHolder ="Mark";
        checkingAccount.showBalance();

        System.out.println("=====================================");

        checkingAccount.deposit(200.0);
        checkingAccount.showBalance();

        checkingAccount.withdraw(1000);

        System.out.println("=======================================");
        checkingAccount.showBalance();

        System.out.println("==================================================");

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.accountHolder = "Sara";
        savingAccount.showBalance();

        savingAccount.deposit(300);

        savingAccount.withdraw(100);
        savingAccount.showBalance();

        savingAccount.withdraw(200);
        savingAccount.showBalance();


    }
}
