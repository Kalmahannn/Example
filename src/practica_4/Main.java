package practica_4;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        IPayment creditCardPayment = new CreditCardPayment();
        order.setPaymentMethod(creditCardPayment);

        order.addProduct(new Product("Laptop", 1000, 1));
        order.processOrder();
    }
}



