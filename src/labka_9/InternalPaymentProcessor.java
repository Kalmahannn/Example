package labka_9;

public class InternalPaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Төлемді өңдеу" + amount + " ішкі жүйе арқылы.");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Төлемді қайтару " + amount + " ішкі жүйе арқылы.");
}
}

