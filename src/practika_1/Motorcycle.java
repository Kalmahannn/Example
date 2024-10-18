package practika_1;

public class Motorcycle extends Vehicle {
    private String bodyType;
    private boolean hasBox;

    public Motorcycle(String brand, String model, int year, String bodyType, boolean hasBox) {
        super(brand, model, year);
        this.bodyType = bodyType;
        this.hasBox = hasBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public boolean hasBox() {
        return hasBox;
    }

    @Override
    public void startEngine() {
        System.out.println("Мотоцикл қозғалтқышын іске қосу: " + getModel());
    }

    @Override
    public void stopEngine() {
        System.out.println("Мотоцикл қозғалтқышын тоқтату: " + getModel());
    }

    @Override
    public String toString() {
        return super.toString() + " | Дене түрі: " + bodyType + " | Бокстың болуы: " + hasBox;
    }
}

