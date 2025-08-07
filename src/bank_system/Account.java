package bank_system;

abstract class Account {
    private Customer customer;
    private double balance;

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);
    abstract double calculateInterest();
}
