package dom7_1;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double exchangeRate;

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(exchangeRate);
        }
    }
}
