package labka_4;

public class Bicycle implements Transport {
    private String model;
    private int speed;

    public Bicycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Велосипед " + model + " едет со скоростью " + speed + " км/ч.");
    }

    @Override
    public void fuelUp() {
        System.out.println("Велосипед " + model + " не нуждается в топливе.");
    }
}

