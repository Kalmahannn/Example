package labka_6;

import java.util.Scanner;

public class ShippingCalculator {
    public static void main(String[] args) {
        DeliveryContext deliveryContext = new DeliveryContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Жеткізу түрін таңдаңыз: 1 - Стандартная, 2 - Экспресс, 3 - Международная, 4 - Ночная");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                deliveryContext.setShippingStrategy(new StandardShippingStrategy());
                break;
            case 2:
                deliveryContext.setShippingStrategy(new ExpressShippingStrategy());
                break;
            case 3:
                deliveryContext.setShippingStrategy(new InternationalShippingStrategy());
                break;
            case 4:
                deliveryContext.setShippingStrategy(new NightShippingStrategy());
                break;
            default:
                System.out.println("Дұрыс емес таңдау.");
                return;
        }

        System.out.println("Пакеттің салмағын енгізіңіз (кг):");
        double weight = scanner.nextDouble();
        if (weight <= 0) {
            System.out.println("Дұрыс емес салмақ.");
            return;
        }

        System.out.println("Жеткізу қашықтығын (км)енгізіңіз:");
        double distance = scanner.nextDouble();
        if (distance <= 0) {
            System.out.println("Дұрыс емес қашықтық.");
            return;
        }

        try {
            double cost = deliveryContext.calculateCost(weight, distance);
            System.out.printf("Жеткізу құны: %.2f%n", cost);
        } catch (Exception e) {
            System.out.println("Қате: " + e.getMessage());
        }

        scanner.close();
    }
}
