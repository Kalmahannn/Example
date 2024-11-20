package labka_11;

import java.util.Date;

public class Loan {
    private int id;
    private Book book;
    private Reader reader;
    private Date loanDate;
    private Date returnDate;

    public Loan(int id, Book book, Reader reader, Date loanDate) {
        this.id = id;
        this.book = book;
        this.reader = reader;
        this.loanDate = loanDate;
    }

    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public Reader getReader() { // Добавляем метод
        return reader;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
