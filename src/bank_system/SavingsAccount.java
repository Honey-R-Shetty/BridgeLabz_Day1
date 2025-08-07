package bank_system;

class SavingsAccount extends Account {
    public SavingsAccount(Customer customer, double balance) {
        super(customer, balance);
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }
}
