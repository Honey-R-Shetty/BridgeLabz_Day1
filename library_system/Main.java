package library_system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Library Menu ---");
			System.out.println("1. Add Book");
			System.out.println("2. Issue Book");
			System.out.println("3. Return Book");
			System.out.println("4. Show Available Books");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();
			sc.nextLine(); // clear buffer

			switch (ch) {
			case 1:
				System.out.print("Enter title: ");
				String title1 = sc.nextLine();
				System.out.print("Enter author: ");
				String author = sc.nextLine();
				lib.addBook(title1, author);
				break;

			case 2:
				System.out.print("Enter title to issue: ");
				String title2 = sc.nextLine();
				lib.issueBook(title2);
				break;

			case 3:
				System.out.print("Enter title to return: ");
				String title3 = sc.nextLine();
				lib.returnBook(title3);
				break;

			case 4:
				lib.showAvailableBooks();
				break;

			case 5:
				System.out.println("Exiting... Bye!");
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
