package practika_7;

public class TravelBookingContext {
    private ICostCalculationStrategy costCalculationStrategy;

    public void setCostCalculationStrategy(ICostCalculationStrategy costCalculationStrategy) {
        this.costCalculationStrategy = costCalculationStrategy;
    }

    public double calculateTotalCost(double distance, String serviceClass, int passengers, boolean hasDiscount) {
        if (costCalculationStrategy == null) {
            throw new IllegalStateException("Есептеу стратегиясы белгіленбеген.");
        }
        return costCalculationStrategy.calculateCost(distance, serviceClass, passengers, hasDiscount);
    }
}

