package task3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Список книг:");
        for (Book book : catalog) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author) {
        System.out.println("Книги автора " + author + ":");
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
            }
        }
    }
}