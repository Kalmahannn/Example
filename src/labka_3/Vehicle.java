package labka_3;

class Vehicle {
    public void start() {
        System.out.println(getClass().getSimpleName() + " is starting");
    }

    public void stop() {
        System.out.println(getClass().getSimpleName() + " is stopping");
    }
}

class Car extends Vehicle { }

class Truck extends Vehicle { }

 class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle truck = new Truck();
        truck.start();
        truck.stop();
    }
}

