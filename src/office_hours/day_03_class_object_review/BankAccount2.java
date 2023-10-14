package office_hours.day_03_class_object_review;

public class BankAccount2 {
    String fulName;
    long accountNumber;
    double balance;
    int pinCode;


    public void openNewAccount(String fulName, long accountNumber, double balance, int pinCode){
        this.fulName = fulName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pinCode = pinCode;
    }

    public void checkBalance(int pinCode){
        if (this.fulName == null){
            System.out.println("Sorry, The account does not exist or it has been closed");
        }
       else if (this.pinCode == pinCode){
            System.out.println("Your balance is: $"+balance);
        }
       else {
            System.out.println("Invalid Pin Code! Please try again");
        }
    }

    public void deposit(int pinCode, double amount){
        if (this.fulName == null){
            System.out.println("Sorry, The account number does not exist or it has been closed");
        }

        else if (this.pinCode == pinCode){
            System.out.println("Depositing: $"+amount);
            balance += amount;
            System.out.println("Your total balance now is: $"+balance);
        } else {
            System.out.println("Invalid Pin Code! Please try again");
        }


    }

    public void withdraw(int pinCode, double amount){
        if (this.fulName == null){
            System.out.println("Sorry, The account does not exist, or it has been closed");
        }
        else if (this.pinCode == pinCode){
            System.out.println("Withdrawing $"+amount);
            balance -= amount;
            System.out.println("Your total balance now is: $"+balance);
        }
        else {
            System.out.println("Invalid Pin Code! Please try again");
        }
    }

    public void getCustomerInfo(int pinCode){
        if (fulName == null){
            System.out.println("Sorry! The account does not exist or it has been closed");
        }
        else if (this.pinCode == pinCode) {
            System.out.println("Full Name: " + fulName + " Account Number: " + accountNumber + " Balance: $" + balance);
        } else {
            System.out.println("Invalid Pin Code! Please try again");
        }

    }

    public void closeAccount(int pinCode){
        if (this.fulName == null){
            System.out.println("This account does not exist or it has been closed already");
        }
        else if (this.pinCode == pinCode){
            this.fulName = null;
            this.accountNumber =0;
            this.balance = 0.0;
            this.pinCode = 0;
            System.out.println("You have successfully closed your account:");
        }
        else {
            System.out.println("Invalid Pin code! Please try again");
        }
    }

}
