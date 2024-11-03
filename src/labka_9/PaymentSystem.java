package labka_9;

public class PaymentSystem {
    public static void main(String[] args) {
        // Используем внутреннюю платежную систему
        IPaymentProcessor internalProcessor = new InternalPaymentProcessor();
        internalProcessor.processPayment(100.0);
        internalProcessor.refundPayment(50.0);

        // Используем внешнюю платежную систему A через адаптер
        ExternalPaymentSystemA externalSystemA = new ExternalPaymentSystemA();
        IPaymentProcessor adapterA = new PaymentAdapterA(externalSystemA);
        adapterA.processPayment(200.0);
        adapterA.refundPayment(100.0);

        // Используем внешнюю платежную систему B через адаптер
        ExternalPaymentSystemB externalSystemB = new ExternalPaymentSystemB();
        IPaymentProcessor adapterB = new PaymentAdapterB(externalSystemB);
        adapterB.processPayment(300.0);
        adapterB.refundPayment(150.0);
    }
}
