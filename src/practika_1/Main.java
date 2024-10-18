package practika_1;

public class Main {
    public static void main(String[] args) {
        // Создание транспортных средств
        Vehicle car1 = new Car("Toyota", "Camry", 2020, 4, "Автоматическая");
        Vehicle car2 = new Car("Honda", "Civic", 2019, 4, "Механическая");
        Vehicle motorcycle1 = new Motorcycle("Yamaha", "MT-07", 2021, "Спорт", true);

        // Создание гаража и автопарка
        Garage garage1 = new Garage();
        garage1.addVehicle(car1);
        garage1.addVehicle(motorcycle1);

        Garage garage2 = new Garage();
        garage2.addVehicle(car2);

        Fleet fleet = new Fleet();
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);

        // Отображение всех транспортных средств в гаражах
        System.out.println("Бірінші гараждағы көлік құралдары:");
        garage1.listVehicles();

        System.out.println("\nЕкінші гараждағы көлік құралдары:");
        garage2.listVehicles();

        // Поиск транспортного средства
        System.out.println("\nCivic үлгісіндегі көлікті іздеу:");
        fleet.findVehicle("Civic");
    }
}

