package practika_7_1;

public interface ISubject {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String stockSymbol, double newPrice);
}

