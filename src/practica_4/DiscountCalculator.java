package practica_4;

public class DiscountCalculator {
    public double applyDiscount(double total) {
        // Example: 10% discount on orders above 100
        if (total > 100) {
            return total * 0.9;
        }
        return total;
    }
}
