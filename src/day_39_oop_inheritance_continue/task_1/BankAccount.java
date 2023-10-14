package day_39_oop_inheritance_continue.task_1;

public class BankAccount {
    protected long accountNumber;
    protected String accountHolder;
    protected double balance;

    public void deposit(double amount){
        this.balance += amount;

    }
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println("Withdraw amount must be equal or less than available balance");
        }

    }
    public void showBalance(){
        System.out.println("Available balance: $"+balance);
    }



}
