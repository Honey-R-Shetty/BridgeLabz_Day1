package bank_system;

public class BankSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Honey", "C101");
        Account savings = new SavingsAccount(c1, 10000);
        Account current = new CurrentAccount(c1, 15000);
        Account fd = new FixedDeposit(c1, 50000);

        System.out.println("Customer: " + c1.getName());

        savings.withdraw(2000);
        System.out.println("Savings Balance: " + savings.getBalance());
        System.out.println("Interest: " + savings.calculateInterest());

        current.withdraw(5000);
        System.out.println("Current Balance: " + current.getBalance());
        System.out.println("Interest: " + current.calculateInterest());

        fd.withdraw(1000);
        System.out.println("Fixed Deposit Balance: " + fd.getBalance());
        System.out.println("Interest: " + fd.calculateInterest());
    }
}
