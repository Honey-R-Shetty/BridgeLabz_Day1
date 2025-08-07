package library_book_management;

class Magazine extends Book {
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    public void printDetails() {
        System.out.println("Magazine: " + getTitle() + " | Issue No: " + issueNumber);
    }
}