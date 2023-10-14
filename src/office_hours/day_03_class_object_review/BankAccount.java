package office_hours.day_03_class_object_review;

public class BankAccount {

    String fullName;
    long accountNumber;
    double balance; // 200 - 100 =100

    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void withdraw(double amount){
        System.out.println("Withdrawing $ "+amount);
        balance -= amount;
        System.out.println("Your total balance is: $"+balance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $ "+amount);
         balance += amount;
        System.out.println("Your total balance is: $"+balance);
    }

    public String toString(){
        return "Account Holder: "+fullName+" "+"Account number: "+accountNumber+" Balance $ "+balance;
    }

    public void setInfo(String fullName, long accountNumber, double balance){

        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



}
