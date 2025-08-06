package mini_atm;

class ATM {
    private int[] pins = {1111, 2222, 3333, 4444, 5555};
    private double[] balances = {1000, 1500, 2000, 2500, 3000};
    private int[] failedAttempts = new int[5];

    private int findUserIndex(int pin) {
        for (int i = 0; i < pins.length; i++) {
            if (pins[i] == pin) return i;
        }
        return -1;
    }

    public int login(int pin) {
        int index = findUserIndex(pin);
        if (index == -1) {
            System.out.println("Invalid PIN.");
            return -1;
        }

        if (failedAttempts[index] >= 3) {
            System.out.println("Account is blocked due to 3 failed attempts.");
            return -1;
        }

        return index;
    }

    public void recordFailedAttempt(int index) {
        if (index >= 0)
        	failedAttempts[index]++;
    }

    public void checkBalance(int index) {
        System.out.println("Your balance is: " + balances[index]);
    }

    public void deposit(int index, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        balances[index] += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(int index, double amount) {
        if (amount > balances[index]) {
            System.out.println("Insufficient funds.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balances[index] -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }
}
