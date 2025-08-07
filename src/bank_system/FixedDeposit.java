package bank_system;

class FixedDeposit extends Account {
    public FixedDeposit(Customer customer, double balance) {
        super(customer, balance);
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawal not allowed in Fixed Deposit before maturity.");
    }

    public double calculateInterest() {
        return getBalance() * 0.08; 
    }
}
