package practica_4;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private List<Product> products = new ArrayList<>();
    private IPayment paymentMethod;
    private IDelivery deliveryMethod;
    private DiscountCalculator discountCalculator;
    private INotification notificationService;

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = products.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
        return discountCalculator.applyDiscount(total);
    }

    public void processOrder() {
        double total = calculateTotal();
        paymentMethod.processPayment(total);
        deliveryMethod.deliverOrder(this);
        notificationService.sendNotification("Сіздің тапсырысыңыз өңделді.");
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryMethod(IDelivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void setDiscountCalculator(DiscountCalculator discountCalculator) {
        this.discountCalculator = discountCalculator;
    }

    public void setNotificationService(INotification notificationService) {
        this.notificationService = notificationService;
    }
}

