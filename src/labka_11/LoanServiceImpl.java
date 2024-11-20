package labka_11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanServiceImpl implements LoanService {
    private List<Loan> loans = new ArrayList<>();
    private BookService bookService;
    private ReaderService readerService;
    private int loanIdCounter = 1;

    public LoanServiceImpl(BookService bookService, ReaderService readerService) {
        this.bookService = bookService;
        this.readerService = readerService;
    }

    @Override
    public Loan issueLoan(int readerId, String isbn) {
        Book book = bookService.searchBookByTitle(isbn);
        if (book == null || !book.isAvailable()) {
            throw new IllegalArgumentException("Книга недоступна");
        }

        Reader reader = readerService.findReaderById(readerId);
        if (reader == null) {
            throw new IllegalArgumentException("Читатель не найден");
        }

        Loan loan = new Loan(loanIdCounter++, book, reader, new Date());
        loans.add(loan);
        book.setAvailable(false);
        return loan;
    }

    @Override
    public void returnBook(int loanId) {
        Loan loan = loans.stream()
                .filter(l -> l.getId() == loanId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Выдача не найдена"));

        loan.setReturnDate(new Date());
        loan.getBook().setAvailable(true);
    }

    @Override
    public List<Loan> getLoansByReader(int readerId) {
        return loans.stream()
                .filter(loan -> loan.getReader().getId() == readerId)
                .toList();
    }
}
