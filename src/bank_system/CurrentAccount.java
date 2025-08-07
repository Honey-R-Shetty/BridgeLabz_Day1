package bank_system;

class CurrentAccount extends Account {
    public CurrentAccount(Customer customer, double balance) {
        super(customer, balance);
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn from Current: ₹" + amount);
        } else {
            System.out.println("Overdraft not allowed.");
        }
    }

    public double calculateInterest() {
        return 0; 
    }
}