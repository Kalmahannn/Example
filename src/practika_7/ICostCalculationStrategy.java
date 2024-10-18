package practika_7;

public interface ICostCalculationStrategy {
    double calculateCost(double distance, String serviceClass, int passengers, boolean hasDiscount);
}

