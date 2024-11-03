package labka_9;

public class Coffee implements IBeverage {
    @Override
    public double getCost() {
        return 50.0;  // Стоимость кофе
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}

