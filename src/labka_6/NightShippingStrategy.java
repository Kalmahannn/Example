package labka_6;

public class NightShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return (weight * 0.6 + distance * 0.15) + 20;
    }
}
