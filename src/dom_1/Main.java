package dom_1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Создаем книги
        Book book1 = new Book("Гарри Поттер", "Дж. К. Роулинг", "12345", 5);
        Book book2 = new Book("Война и мир", "Лев Толстой", "67890", 3);
        Book book3 = new Book("1984", "Джордж Оруэлл", "11111", 4);

        // Добавляем книги в библиотеку
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Выводим список книг
        library.printBooks();

        // Создаем читателей
        Reader reader1 = new Reader("Алексей Иванов", "R001");
        Reader reader2 = new Reader("Мария Петрова", "R002");

        // Регистрируем читателей
        library.registerReader(reader1);
        library.registerReader(reader2);

        // Выводим список читателей
        library.printReaders();

        // Выдача книги читателю
        library.lendBook("12345", "R001");

        // Попробуем вернуть книгу
        library.returnBook("12345");

        // Удалим книгу
        library.removeBook("67890");

        // Удалим читателя
        library.removeReader("R002");

        // Выводим обновленный список книг и читателей
        library.printBooks();
        library.printReaders();
    }
}

