package labka_9;

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;  // Стоимость с добавлением сахара
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
