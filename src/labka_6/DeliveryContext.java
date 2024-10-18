package labka_6;

public class DeliveryContext {
    private ShippingStrategy shippingStrategy;


    public void setShippingStrategy(ShippingStrategy strategy) {
        this.shippingStrategy = strategy;
    }


    public double calculateCost(double weight, double distance) {
        if (shippingStrategy == null) {
            throw new IllegalStateException("Жеткізу стратегиясы белгіленбеген.");
        }
        return shippingStrategy.calculateShippingCost(weight, distance);
    }
}
