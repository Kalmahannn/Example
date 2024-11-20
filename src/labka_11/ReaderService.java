package labka_11;


public interface ReaderService {
    void addReader(Reader reader);
    void removeReader(int readerId);
    Reader findReaderById(int readerId);
}
