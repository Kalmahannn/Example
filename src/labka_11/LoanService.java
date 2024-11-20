package labka_11;

import java.util.List;

public interface LoanService {
    Loan issueLoan(int readerId, String isbn);
    void returnBook(int loanId);
    List<Loan> getLoansByReader(int readerId);
}
