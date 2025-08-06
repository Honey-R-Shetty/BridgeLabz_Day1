package bank_system;

public class Bank {
    private Account[] accounts = new Account[10];
    private int count = 0;

    public void createAccount(String owner, double initialBalance) {
        if (count < 10) {
            accounts[count++] = new Account(owner, initialBalance);
            System.out.println("Account created for " + owner + " with " + initialBalance);
        } else {
            System.out.println("Limit reached...Cannot create more accounts.");
        }
    }

    public Account findAccount(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    public void deposit(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
            System.out.println("Deposited " + amount + " to account " + accNo);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            if (acc.withdraw(amount))
                System.out.println("Withdrew " + amount + " from account " + accNo);
        } else {
            System.out.println("Account not found");
        }
    }

    public void transfer(int fromAcc, int toAcc, double amount) {
        Account from = findAccount(fromAcc);
        Account to = findAccount(toAcc);
        if (from != null && to != null) {
            if (from.withdraw(amount)) {
                to.deposit(amount);
                System.out.println("Transferred " + amount + " from account " + fromAcc + " to " + toAcc);
            }
        } else {
            System.out.println("Account not found");
        }
    }

    public void showAllAccounts() {
        for (int i = 0; i < count; i++) {
            accounts[i].display();
        }
    }
}

