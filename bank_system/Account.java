package bank_system;

class Account {
    int accountNumber;
    double balance;
    Customer customer;

    public Account(int accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }else {
        	System.out.println("Insufficient balance in the account...");
        }
    }
    public void printStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer: " + customer.name);
        System.out.println("Balance: " + balance);
    }
}
