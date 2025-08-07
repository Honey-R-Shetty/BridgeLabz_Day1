package library_book_management;

class NonFiction extends Book {
    private String subject;

    public NonFiction(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    public void printDetails() {
        System.out.println("Non-Fiction Book: " + getTitle() + " | Subject: " + subject);
    }
}