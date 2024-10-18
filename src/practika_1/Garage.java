package practika_1;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public void listVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
