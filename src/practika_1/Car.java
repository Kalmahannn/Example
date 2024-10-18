package practika_1;

public class Car extends Vehicle {
    private int doors;
    private String transmissionType;

    public Car(String brand, String model, int year, int doors, String transmissionType) {
        super(brand, model, year);
        this.doors = doors;
        this.transmissionType = transmissionType;
    }

    public int getDoors() {
        return doors;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    @Override
    public void startEngine() {
        System.out.println("Автомобиль қозғалтқышын іске қосу: " + getModel());
    }

    @Override
    public void stopEngine() {
        System.out.println("Автокөлік қозғалтқышын тоқтату: " + getModel());
    }

    @Override
    public String toString() {
        return super.toString() + " |Есіктер саны: " + doors + " | Беріліс түрі: " + transmissionType;
    }
}

