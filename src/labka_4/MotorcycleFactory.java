package labka_4;

public class MotorcycleFactory extends TransportFactory {
    @Override
    public Transport createTransport(String model, int speed) {
        return new Motorcycle(model, speed);
    }
}

