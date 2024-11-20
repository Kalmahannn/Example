package labka_11;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    void removeBook(String isbn);
    Book searchBookByTitle(String title);
    List<Book> getAllAvailableBooks();
}
