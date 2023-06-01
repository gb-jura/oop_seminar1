package task3;

public class Program {

  public static void main(String[] args) {
    Book book1 = new Book("Руслан и Людмила", "А.С. Пушкин");
    Book book2 = new Book("Снежная королева", "Г. Х. Андерсен");
    Book book3 = new Book("Истинная правда", "Г. Х. Андерсен");

    Library library = new Library();
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    library.displayAvailableBooks();

    library.searchByAuthor("Г. Х. Андерсен");

    library.removeBook(book2);

    library.displayAvailableBooks();
  }
}
