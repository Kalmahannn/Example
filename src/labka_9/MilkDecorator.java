package labka_9;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;  // Стоимость с добавлением молока
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
