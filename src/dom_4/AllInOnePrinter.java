package dom_4;

public class AllInOnePrinter implements IPrinter, IScanner, IFax {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}

class BasicPrinter implements IPrinter {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}
