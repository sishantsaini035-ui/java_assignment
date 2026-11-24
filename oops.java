
class BankAccount {

   
    String accountNumber;
    String accountHolderName;
    double balance;

    
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class oops {
    public static void main(String[] args) {

        
        BankAccount a1 = new BankAccount("A101", "Rahul", 5000);

     
        BankAccount a2 = new BankAccount("A102", "Priya", 8000);

       
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.withdraw(10000);

        
        a2.deposit(3000);
        a2.withdraw(4000);

        
        System.out.println("\nAccount 1:");
        a1.displayDetails();
        a1.checkBalance();

        System.out.println("\nAccount 2:");
        a2.displayDetails();
        a2.checkBalance();
    }
}