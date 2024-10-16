package labka_4;

public class Plane implements Transport {
    private String model;
    private int speed;

    public Plane(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Самолет " + model + " летит со скоростью " + speed + " км/ч.");
    }

    @Override
    public void fuelUp() {
        System.out.println("Самолет " + model + " заправляется керосином.");
    }
}


