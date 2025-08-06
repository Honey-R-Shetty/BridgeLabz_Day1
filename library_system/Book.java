package library_system;

class Book {
	private String title;
	private String author;
	private boolean issued;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.issued = false;
	}

	public String getTitle() {
		return title;
	}

	public boolean isIssued() {
		return issued;
	}

	public void issue() {
		issued = true;
	}

	public void returnBook() {
		issued = false;
	}

	public void showDetails() {
		System.out.println("Title: " + title + ", Author: " + author + ", Issued: " + issued);
	}
}
