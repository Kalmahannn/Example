package labka_9;

public interface IPaymentProcessor {
    void processPayment(double amount);
    void refundPayment(double amount);
}
