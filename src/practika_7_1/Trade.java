package practika_7_1;

 class Trader implements IObserver {
    private String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Трейдер " + name + ": Акция бағасы " + stockSymbol + " өзгерді " + price);
    }
}

class TradingRobot implements IObserver {
    private String stockSymbol;
    private double threshold;

    public TradingRobot(String stockSymbol, double threshold) {
        this.stockSymbol = stockSymbol;
        this.threshold = threshold;
    }

    @Override
    public void update(String stockSymbol, double price) {
        if (this.stockSymbol.equals(stockSymbol)) {
            if (price > threshold) {
                System.out.println("Сауда роботы акцияларды сатады " + stockSymbol + " бағасы бойынша " + price);
            } else {
                System.out.println("Сауда роботы акцияларды сатып алады " + stockSymbol + " бағасы бойынша " + price);
            }
        }
    }
}
