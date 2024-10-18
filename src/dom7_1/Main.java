package dom7_1;

public class Main {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();


        Observer screenObserver = new ScreenObserver();
        Observer logObserver = new LogObserver();
        Observer notificationObserver = new NotificationObserver();

        currencyExchange.registerObserver(screenObserver);
        currencyExchange.registerObserver(logObserver);
        currencyExchange.registerObserver(notificationObserver);

        currencyExchange.setExchangeRate(74.85);
        currencyExchange.setExchangeRate(75.50);

        currencyExchange.removeObserver(logObserver);
        currencyExchange.setExchangeRate(76.00);
    }
}
