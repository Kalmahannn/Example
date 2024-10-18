package labka_7;

public class AirConditionerOnCommand implements Command {
    private AirConditioner ac;

    public AirConditionerOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.on();
    }

    @Override
    public void undo() {
        ac.off();
    }
}

class AirConditionerOffCommand implements Command {
    private AirConditioner ac;

    public AirConditionerOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }

    @Override
    public void undo() {
        ac.on();
    }
}

 class AirConditioner {
    public void on() {
        System.out.println("Кондиционер қосылған.");
    }

    public void off() {
        System.out.println("Кондиционер өшірулі.");
    }
}
