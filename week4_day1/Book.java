package week4_day1;

import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> bookList = new ArrayList<>();

        // Add book objects to the ArrayList
        bookList.add(new Book(1, "The Hobbit", "J.R.R. Tolkien"));
        bookList.add(new Book(2, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
        bookList.add(new Book(3, "The Catcher in the Rye", "J.D. Salinger"));

        // Display all book details using enhanced for loop
        System.out.println("All Book Details:");
        System.out.println("-----------------");

        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            // Display book details
            System.out.println("Book ID: " + book.bookId);
            System.out.println("Book Name: " + book.bookName);
            System.out.println("Author Name: " + book.authorName);
            System.out.println("-----------------");
        }
    }
}
