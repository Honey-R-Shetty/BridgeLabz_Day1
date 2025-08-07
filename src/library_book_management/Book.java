package library_book_management;

abstract class Book {
	private String title;
	private String author;
	private boolean isIssued = false;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public abstract void printDetails();

	public void issueBook() {
		if (!isIssued) {
			isIssued = true;
			System.out.println(title + " has been issued.");
		} else {
			System.out.println(title + " is already issued.");
		}
	}

	public void returnBook() {
		if (isIssued) {
			isIssued = false;
			System.out.println(title + " has been returned.");
		} else {
			System.out.println(title + " was not issued.");
		}
	}

	public String getTitle() {
		return title;
	}

	public boolean isIssued() {
		return isIssued;
	}
}
