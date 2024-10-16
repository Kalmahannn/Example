package labka_4;

public class CarFactory extends TransportFactory {
    @Override
    public Transport createTransport(String model, int speed) {
        return new Car(model, speed);
    }
}

