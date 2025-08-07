package library_book_management;

import java.util.Scanner;

public class LibraryManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book b1 = new Fiction("Harry Potter", "J.K. Rowling", "Fantasy");
		Book b2 = new NonFiction("Wings of Fire", "A.P.J. Abdul Kalam", "Biography");
		Book b3 = new Magazine("National Geographic", "NatGeo Team", 202);

		while (true) {
			System.out.println("\n--- Library Menu ---");
			System.out.println("1. Issue Book");
			System.out.println("2. Return Book");
			System.out.println("3. Show Book Details");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();

			System.out.println("\nSelect Book:\n1. Harry Potter\n2. Wings of Fire\n3. National Geographic");
			int bookChoice = sc.nextInt();
			Book selectedBook = null;

			switch (bookChoice) {
			case 1:
				selectedBook = b1;
				break;
			case 2:
				selectedBook = b2;
				break;
			case 3:
				selectedBook = b3;
				break;
			default:
				System.out.println("Invalid book selection.");
				continue;
			}

			switch (choice) {
			case 1:
				selectedBook.issueBook();
				break;
			case 2:
				selectedBook.returnBook();
				break;
			case 3:
				selectedBook.printDetails();
				break;
			case 4:
				System.out.println("Exiting Library...");
				return;
			default:
				System.out.println("Invalid option.");
			}
		}
	}
}
