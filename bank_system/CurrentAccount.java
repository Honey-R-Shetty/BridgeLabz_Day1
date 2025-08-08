package bank_system;

class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, Customer customer) {
        super(accountNumber, customer);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }else
        	System.out.println("Insufficient balance in the account...");
    }
}
