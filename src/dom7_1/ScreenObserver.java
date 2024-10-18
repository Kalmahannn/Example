package dom7_1;

public class ScreenObserver implements Observer {
    @Override
    public void update(double exchangeRate) {
        System.out.println("Жаңа валюта бағамы: " + exchangeRate);
    }
}

 class LogObserver implements Observer {
    @Override
    public void update(double exchangeRate) {
        System.out.println("Журналға жазу: Курс өзгерді " + exchangeRate);
    }
}

 class NotificationObserver implements Observer {
    @Override
    public void update(double exchangeRate) {
        System.out.println("Хабарлама: валюта бағамы енді " + exchangeRate);
    }
}
