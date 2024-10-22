package dom_8;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat();

        RemoteContro remote = new RemoteContro();

        remote.setCommand(new LightOnCommand(light));
        remote.undoCommand();

        remote.setCommand(new DoorOpenCommand(door));
        remote.undoCommand();

        remote.setCommand(new SetTemperatureCommand(thermostat, 25));
    }
}

