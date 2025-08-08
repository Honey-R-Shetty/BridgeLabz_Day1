package bank_system;

class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, Customer customer) {
        super(accountNumber, customer);
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount >= 500) {
            balance -= amount;
        }else
        	System.out.println("Insufficient balance in the account...");
    }
}
