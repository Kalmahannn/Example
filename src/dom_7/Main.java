package dom_7;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.pay(100);

        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.pay(150);

        paymentContext.setPaymentStrategy(new CryptoPayment());
        paymentContext.pay(200);
    }
}
