package dom_1;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int copiesAvailable;

    public Book(String title, String author, String ISBN, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.copiesAvailable = copiesAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void lendBook() {
        if (copiesAvailable > 0) {
            copiesAvailable--;
        } else {
            throw new IllegalStateException("Кітап шығару үшін қол жетімді емес.");
        }
    }

    public void returnBook() {
        copiesAvailable++;
    }

    @Override
    public String toString() {
        return "Кітап: " + title + " | Автор: " + author + " | ISBN: " + ISBN + " | Даналар: " + copiesAvailable;
    }
}

