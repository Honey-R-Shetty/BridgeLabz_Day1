package library_book_management;

public class Fiction extends Book{
	private String genre;

    public Fiction(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    public void printDetails() {
        System.out.println("Fiction Book: " + getTitle() + " | Genre: " + genre);
    }
}
