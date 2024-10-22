package practika_8;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(3);

        Light light = new Light();
        AirConditioner ac = new AirConditioner();
        TV tv = new TV();

        remote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        remote.setCommand(1, new AirConditionerOnCommand(ac), new AirConditionerOffCommand(ac));
        remote.setCommand(2, new TVOnCommand(tv), new TVOffCommand(tv));

        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.undoButtonPressed();

        Command[] partyOn = {new LightOnCommand(light), new AirConditionerOnCommand(ac), new TVOnCommand(tv)};
        MacroCommand partyMacro = new MacroCommand(partyOn);

        partyMacro.execute();
        partyMacro.undo();
    }
}

