package labka_11;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        ReaderService readerService = new ReaderServiceImpl();
        LoanService loanService = new LoanServiceImpl(bookService, readerService);

        bookService.addBook(new Book("Java Basics", "Author A", "12345"));
        readerService.addReader(new Reader(1, "Alice", "alice@example.com"));

        Loan loan = loanService.issueLoan(1, "Java Basics");
        System.out.println("Книга выдана: " + loan.getBook().getTitle());

        loanService.returnBook(loan.getId());
        System.out.println("Книга возвращена: " + loan.getBook().getTitle());
    }
}
