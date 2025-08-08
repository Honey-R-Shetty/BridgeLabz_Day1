package bank_system;

public class BankTest {
	public static void main(String[] args) {

		Customer customer = new Customer("Honey", 101);
		SavingsAccount savings = new SavingsAccount(2001, customer);
		CurrentAccount current = new CurrentAccount(2002, customer);

		savings.deposit(100);
		current.deposit(30000);

		savings.withdraw(20000);
		current.withdraw(15000);

		savings.printStatement();
		current.printStatement();
	}
}
