package bank_system;

public class Account {
    private static int counter = 1001; 
    private int accountNumber;
    private String personName;
    private double balance;

    public Account(String owner, double balance) {
        this.accountNumber = counter++;
        this.personName = owner;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return personName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid amount");
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        System.out.println("Insufficient balance...");
        return false;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Owner: " + personName + ", Balance: " + balance);
    }
}

