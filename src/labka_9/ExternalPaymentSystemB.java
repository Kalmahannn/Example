package labka_9;

public class ExternalPaymentSystemB {
    public void sendPayment(double amount) {
        System.out.println("Төлемді жіберу" + amount + " Сыртқы Төлем Жүйесі Арқылы B.");
    }

    public void processRefund(double amount) {
        System.out.println("Ақшаны қайтаруды өңдеу " + amount + " Сыртқы Төлем Жүйесі Арқылы B.");
    }
}

