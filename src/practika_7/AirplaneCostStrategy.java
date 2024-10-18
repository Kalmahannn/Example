package practika_7;

public class AirplaneCostStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, String serviceClass, int passengers, boolean hasDiscount) {
        double basePrice = 100 * distance;
        if ("business".equalsIgnoreCase(serviceClass)) {
            basePrice *= 1.5;
        }
        if (hasDiscount) {
            basePrice *= 0.9;
        }
        return basePrice * passengers;
    }
}

class TrainCostStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, String serviceClass, int passengers, boolean hasDiscount) {
        double basePrice = 50 * distance;
        if ("business".equalsIgnoreCase(serviceClass)) {
            basePrice *= 1.2;
        }
        if (hasDiscount) {
            basePrice *= 0.85;
        }
        return basePrice * passengers;
    }
}

class BusCostStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, String serviceClass, int passengers, boolean hasDiscount) {
        double basePrice = 20 * distance;
        if (hasDiscount) {
            basePrice *= 0.8;
        }
        return basePrice * passengers;
    }
}

