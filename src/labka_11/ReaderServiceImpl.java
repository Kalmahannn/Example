package labka_11;

import java.util.ArrayList;
import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    private List<Reader> readers = new ArrayList<>();

    @Override
    public void addReader(Reader reader) {
        readers.add(reader);
    }

    @Override
    public void removeReader(int readerId) {
        readers.removeIf(reader -> reader.getId() == readerId);
    }

    @Override
    public Reader findReaderById(int readerId) {
        return readers.stream()
                .filter(reader -> reader.getId() == readerId)
                .findFirst()
                .orElse(null);
    }
}
