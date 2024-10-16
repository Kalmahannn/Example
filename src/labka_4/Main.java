package labka_4;

import java.util.Scanner;
//	• Тасымалдау интерфейсі: нақты көлік сыныптарында жүзеге асырылатын move() және fuelUp() екі әдісін анықтайды.
//	• Зауыттар: Әрбір бетон зауыты TransportFactory абстрактілі сыныбынан мұра алады және сәйкес көліктің нысанын
//	қайтаратын createTransport() әдісін жүзеге асырады.
//        • Пайдаланушы енгізуі: Бағдарламаның негізгі класы пайдаланушыға көлік түрін таңдауға, моделін және
//        жылдамдығын көрсетуге мүмкіндікбереді.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип транспортного средства: 1 - Автомобиль, 2 - Мотоцикл, 3 - Самолет, 4 - Велосипед");
        int choice = scanner.nextInt();

        scanner.nextLine(); // для считывания оставшегося символа новой строки
        System.out.println("Введите модель:");
        String model = scanner.nextLine();

        System.out.println("Введите скорость:");
        int speed = scanner.nextInt();

        TransportFactory factory = null;

        switch (choice) {
            case 1:
                factory = new CarFactory();
                break;
            case 2:
                factory = new MotorcycleFactory();
                break;
            case 3:
                factory = new PlaneFactory();
                break;
            case 4:
                factory = new BicycleFactory();
                break;
            default:
                System.out.println("Неправильный выбор.");
                return;
        }

        Transport transport = factory.createTransport(model, speed);
        transport.move();
        transport.fuelUp();

        scanner.close();
    }
}
