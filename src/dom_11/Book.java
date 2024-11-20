package dom_11;

import java.util.ArrayList;
import java.util.List;

// Класс книги
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isAvailable ? " (Available)" : " (Rented)");
    }
}

// Класс читателя
class Reader {
    private String name;
    private List<Book> rentedBooks;

    public Reader(String name) {
        this.name = name;
        this.rentedBooks = new ArrayList<>();
    }

    public void rentBook(Book book) {
        if (book.isAvailable() && rentedBooks.size() < 3) { // Ограничение: 3 книги
            book.setAvailable(false);
            rentedBooks.add(book);
            System.out.println(name + " rented \"" + book.getTitle() + "\".");
        } else {
            System.out.println("Cannot rent \"" + book.getTitle() + "\". Either unavailable or limit reached.");
        }
    }

    public void returnBook(Book book) {
        if (rentedBooks.remove(book)) {
            book.setAvailable(true);
            System.out.println(name + " returned \"" + book.getTitle() + "\".");
        } else {
            System.out.println(name + " does not have \"" + book.getTitle() + "\".");
        }
    }
}

// Класс библиотеки
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

// Главный класс
 class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Reader reader = new Reader("Alice");

        // Добавляем книги
        library.addBook(new Book("1984", "George Orwell", "123456"));
        library.addBook(new Book("Brave New World", "Aldous Huxley", "789012"));
        library.addBook(new Book("Fahrenheit 451", "Ray Bradbury", "345678"));

        // Выводим список книг
        library.listBooks();

        // Читатель арендует книгу
        Book book = library.findBook("1984");
        if (book != null) reader.rentBook(book);

        // Снова выводим список книг
        library.listBooks();

        // Читатель возвращает книгу
        if (book != null) reader.returnBook(book);

        // Снова выводим список книг
        library.listBooks();
    }
}

