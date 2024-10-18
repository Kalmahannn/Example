package dom_7;


public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Төлем " + amount + " банк картасы арқылы.");
    }
}


 class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Төлем " + amount + " PayPal арқылы.");
    }
}


class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Төлем " + amount + " криптовалюта арқылы.");
    }
}
