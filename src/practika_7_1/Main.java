package practika_7_1;

public class Main {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

        Trader trader = new Trader("Иван");
        TradingRobot robot = new TradingRobot("AAPL", 150.0);

        stockExchange.registerObserver(trader);
        stockExchange.registerObserver(robot);

        stockExchange.setStockPrice("AAPL", 145.0);
        stockExchange.setStockPrice("AAPL", 155.0);
    }
}

