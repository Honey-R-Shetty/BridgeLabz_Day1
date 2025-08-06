package mini_atm;

import java.util.Scanner;

public class MainATM {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        
        int attempts = 0;
        int userIndex = -1;

        System.out.println("----- Welcome to My ATM -----");

        while (attempts < 3) {
            System.out.print("Enter your 4-digit PIN: ");
            int pin = sc.nextInt();
            userIndex = atm.login(pin);

            if (userIndex != -1)
            	break;
            atm.recordFailedAttempt(atm.login(pin)); 
            attempts++;
            if (attempts == 3) {
                System.out.println("Too many failed attempts. Try again later.");
                return;
            }
        }

        int choice;
        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance(userIndex);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    atm.deposit(userIndex, dep);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double with = sc.nextDouble();
                    atm.withdraw(userIndex, with);
                    break;
                case 4:
                    System.out.println("Thank you for using Honeys ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }
        } while(true);

    }
}
