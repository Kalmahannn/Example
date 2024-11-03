package labka_9;

public class ChocolateDecorator extends BeverageDecorator {
    public ChocolateDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.0;  // Стоимость с добавлением шоколада
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }
}
