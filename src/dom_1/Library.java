package dom_1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
    }

    public void removeReader(String readerId) {
        readers.removeIf(reader -> reader.getReaderId().equals(readerId));
    }

    public void lendBook(String ISBN, String readerId) {
        Book bookToLend = books.stream()
                .filter(book -> book.getISBN().equals(ISBN))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Кітап табылмады."));
        bookToLend.lendBook();
        System.out.println("Кітап оқырманға берілді " + readerId);
    }

    public void returnBook(String ISBN) {
        Book bookToReturn = books.stream()
                .filter(book -> book.getISBN().equals(ISBN))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Кітап табылмады."));
        bookToReturn.returnBook();
        System.out.println("Кітап кітапханаға қайтарылды.");
    }

    public void printBooks() {
        books.forEach(System.out::println);
    }

    public void printReaders() {
        readers.forEach(System.out::println);
    }
}
