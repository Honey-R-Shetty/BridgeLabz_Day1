package library_system;

class Library {
	private Book[] books = new Book[5];
	private int count = 0;

	public void addBook(String title, String author) {
		if (count < 5) {
			books[count++] = new Book(title, author);
			System.out.println("Book added successfully.");
		} else {
			System.out.println("Library full! Cannot add more books.");
		}
	}

	public void issueBook(String title) {
		for (Book b : books) {
			if (b != null && b.getTitle().equalsIgnoreCase(title)) {
				if (!b.isIssued()) {
					b.issue();
					System.out.println("Book issued: " + title);
					return;
				} else {
					System.out.println("Book is already issued.");
					return;
				}
			}
		}
		System.out.println("Book not found.");
	}

	public void returnBook(String title) {
		for (Book b : books) {
			if (b != null && b.getTitle().equalsIgnoreCase(title)) {
				if (b.isIssued()) {
					b.returnBook();
					System.out.println("Book returned: " + title);
					return;
				} else {
					System.out.println("Book was not issued.");
					return;
				}
			}
		}
		System.out.println("Book not found.");
	}

	public void showAvailableBooks() {
		boolean any = false;
		for (Book b : books) {
			if (b != null && !b.isIssued()) {
				b.showDetails();
				any = true;
			}
		}
		if (!any) {
			System.out.println("No available books.");
		}
	}
}
