package dom_5;

public interface Document {
    void open();

    class InvoiceCreator extends DocumentCreator {
        @Override
        public Document createDocument() {
            return new Invoice();
        }
    }
}
