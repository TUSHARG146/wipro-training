class BankAccount {  
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. Current balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Current balance: " + balance);
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankOperations { 
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("Tushar Gupta", "123456789", 5000.0);

        account.deposit(2000);
        account.withdraw(1500);     
        System.out.println("Final Balance: " + account.checkBalance()); 

        if (account.checkBalance() < 1000) {
            System.out.println("Your balance is low! Please deposit funds.");
        } else {
            System.out.println("You have sufficient balance.");
        }
    }
}
