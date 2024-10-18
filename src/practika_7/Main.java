package practika_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TravelBookingContext bookingContext = new TravelBookingContext();
        Scanner scanner = new Scanner(System.in);

        // Ввод данных пользователя
        System.out.print("Қашықтықты енгізіңіз: ");
        double distance = scanner.nextDouble();

        System.out.print("Қызмет көрсету класын енгізіңіз (economy/business): ");
        String serviceClass = scanner.next();

        System.out.print("Жолаушылар санын енгізіңіз: ");
        int passengers = scanner.nextInt();

        System.out.print("Жеңілдік бар ма? (true/false): ");
        boolean hasDiscount = scanner.nextBoolean();

        // Выбор стратегии транспорта
        System.out.println("Көлікті таңдаңыз (1: ұшақ, 2: пойыз, 3: автобус): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bookingContext.setCostCalculationStrategy(new AirplaneCostStrategy());
                break;
            case 2:
                bookingContext.setCostCalculationStrategy(new TrainCostStrategy());
                break;
            case 3:
                bookingContext.setCostCalculationStrategy(new BusCostStrategy());
                break;
            default:
                System.out.println("Дұрыс емес көлік таңдауы.");
                return;
        }

        // Расчет стоимости поездки
        double totalCost = bookingContext.calculateTotalCost(distance, serviceClass, passengers, hasDiscount);
        System.out.println("Сапардың жалпы құны: " + totalCost);
    }
}

