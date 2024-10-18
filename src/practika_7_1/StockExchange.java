package practika_7_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockExchange implements ISubject {
    private Map<String, Double> stocks = new HashMap<>();
    private List<IObserver> observers = new ArrayList<>();

    public void setStockPrice(String stockSymbol, double newPrice) {
        stocks.put(stockSymbol, newPrice);
        notifyObservers(stockSymbol, newPrice);
    }

    public double getStockPrice(String stockSymbol) {
        return stocks.getOrDefault(stockSymbol, 0.0);
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockSymbol, double newPrice) {
        for (IObserver observer : observers) {
            observer.update(stockSymbol, newPrice);
        }
    }
}

