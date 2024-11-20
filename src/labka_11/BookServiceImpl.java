package labka_11;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public Book searchBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title) && book.isAvailable())
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Book> getAllAvailableBooks() {
        return books.stream().filter(Book::isAvailable).toList();
    }
}
