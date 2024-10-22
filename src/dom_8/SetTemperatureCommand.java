package dom_8;

public class SetTemperatureCommand implements Command {
    private Thermostat thermostat;
    private int temp;

    public SetTemperatureCommand(Thermostat thermostat, int temp) {
        this.thermostat = thermostat;
        this.temp = temp;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temp);
    }

    @Override
    public void undo() {
        System.out.println("Отмена изменения температуры.");
    }
}
