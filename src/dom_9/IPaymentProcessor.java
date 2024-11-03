package dom_9;

public interface IPaymentProcessor {
    void processPayment(double amount);
}

 class PayPalPaymentProcessor implements IPaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment through PayPal: $" + amount);
    }
}

 class StripePaymentService {
    public void makeTransaction(double totalAmount) {
        System.out.println("Processing payment through Stripe: $" + totalAmount);
    }
}

 class StripePaymentAdapter implements IPaymentProcessor {
    private StripePaymentService stripeService;

    public StripePaymentAdapter(StripePaymentService stripeService) {
        this.stripeService = stripeService;
    }

    public void processPayment(double amount) {
        stripeService.makeTransaction(amount);
    }
}

 class PaymentSystem {
    public static void main(String[] args) {
        IPaymentProcessor paypal = new PayPalPaymentProcessor();
        IPaymentProcessor stripe = new StripePaymentAdapter(new StripePaymentService());

        paypal.processPayment(50.0);
        stripe.processPayment(50.0);
    }
}
