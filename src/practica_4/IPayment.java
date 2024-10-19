package practica_4;

public interface IPayment {
    void processPayment(double amount);
}
 class CreditCardPayment implements IPayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Несиелік карта бойынша төлемді өңдеу " + amount);
    }
}

