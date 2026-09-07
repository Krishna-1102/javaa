public class Book {

    int bookId;
    String bookTitle;
    String author;
    boolean available;

    Book(int bookId, String bookTitle, String author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.available = true;
    }

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        available = true;
        System.out.println("Book returned successfully.");
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);

        if (available) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Issued");
        }
    }

    public static void main(String[] args) {

        Book b = new Book(101, "Java Programming", "James Gosling");

        b.displayBook();

        System.out.println();

        b.issueBook();

        System.out.println();

        b.displayBook();

        System.out.println();

        b.issueBook();

        System.out.println();

        b.returnBook();

        System.out.println();

        b.displayBook();
    }
}