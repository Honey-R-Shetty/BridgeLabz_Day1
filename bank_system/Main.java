package bank_system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Bank bank = new Bank();

		while (true) {
			System.out.println("------MENU------");
			System.out.println("1. CREATE ACCOUNT");
			System.out.println("2. FIND ACCOUNT");
			System.out.println("3. DEPOSIT AMOUNT");
			System.out.println("4. WITHDRAW AMOUNT");
			System.out.println("5. TRANSFER AMOUNT");
			System.out.println("6. SHOW ALL ACCOUNTS");
			System.out.println("7. EXIT");
			System.out.print("Enter your choice : ");
			int n = s.nextInt();
			switch (n) {
			case 1:
				System.out.print("Enter owner name: ");
				s.nextLine();
				String owner = s.nextLine();
				System.out.print("Enter initial balance: ");
				double balance = s.nextDouble();
				bank.createAccount(owner, balance);
				break;

			case 2:
				System.out.print("Enter account number to search: ");
				int accNo = s.nextInt();
				Account acc = bank.findAccount(accNo);
				if (acc != null) {
					acc.display();
				} else {
					System.out.println("Account not found.");
				}
				break;

			case 3:
				System.out.print("Enter account number: ");
				int accNum = s.nextInt();
				System.out.print("Enter amount to deposit: ");
				double depAmt = s.nextDouble();
				bank.deposit(accNum, depAmt);
				break;

			case 4:
				System.out.print("Enter account number: ");
				int wAcc = s.nextInt();
				System.out.print("Enter amount to withdraw: ");
				double wAmt = s.nextDouble();
				bank.withdraw(wAcc, wAmt);
				break;

			case 5:
				System.out.print("Enter FROM account number: ");
				int from = s.nextInt();
				System.out.print("Enter TO account number: ");
				int to = s.nextInt();
				System.out.print("Enter amount to transfer: ");
				double amt = s.nextDouble();
				bank.transfer(from, to, amt);
				break;

			case 6:
				bank.showAllAccounts();
				break;

			case 7:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
