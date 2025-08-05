public class BankingSystem {
    static class Customer {
        String name;
        int customerId;

        public Customer(String name, int customerId) {
            this.name = name;
            this.customerId = customerId;
        }
    }

    static class Account {
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
            }
        }

        public void printStatement() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Customer: " + customer.name);
            System.out.println("Balance: " + balance);
        }
    }

    static class SavingsAccount extends Account {
        public SavingsAccount(int accountNumber, Customer customer) {
            super(accountNumber, customer);
        }

        public void withdraw(double amount) {
            if (amount <= balance && amount <= 25000) {
                balance -= amount;
            }
        }
    }

    static class CurrentAccount extends Account {
        public CurrentAccount(int accountNumber, Customer customer) {
            super(accountNumber, customer);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            }
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Honey", 101);
        SavingsAccount savings = new SavingsAccount(2001, customer);
        CurrentAccount current = new CurrentAccount(2002, customer);

        savings.deposit(50000);
        current.deposit(30000);

        savings.withdraw(20000);
        current.withdraw(15000);

        savings.printStatement();
        current.printStatement();
    }
}