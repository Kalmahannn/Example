package practika_1;

import java.util.List;
import java.util.ArrayList;

public class Fleet {
    private List<Garage> garages;

    public Fleet() {
        garages = new ArrayList<>();
    }

    public void addGarage(Garage garage) {
        garages.add(garage);
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage);
    }

    public void findVehicle(String model) {
        for (Garage garage : garages) {
            for (Vehicle vehicle : garage.getVehicles()) { // Теперь используем метод getVehicles()
                if (vehicle.getModel().equalsIgnoreCase(model)) {
                    System.out.println("Табылды: " + vehicle);
                    return;
                }
            }
        }
        System.out.println("Ткөлік табылмады.");
    }
}


