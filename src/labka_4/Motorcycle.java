package labka_4;

public class Motorcycle implements Transport {
    private String model;
    private int speed;

    public Motorcycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Мотоцикл " + model + " едет со скоростью " + speed + " км/ч.");
    }

    @Override
    public void fuelUp() {
        System.out.println("Мотоцикл " + model + " заправляется бензином.");
    }
}


