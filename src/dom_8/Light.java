package dom_8;

public class Light {
    public void on() {
        System.out.println("Свет включен.");
    }

    public void off() {
        System.out.println("Свет выключен.");
    }
}

 class Door {
    public void open() {
        System.out.println("Дверь открыта.");
    }

    public void close() {
        System.out.println("Дверь закрыта.");
    }
}

 class Thermostat {
    private int temperature;

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println("Температура установлена на " + temperature + " градусов.");
    }
}
