package labka_7;

public class SmartHome {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();
        Television tv = new Television();


        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);


        Command tvOn = new TelevisionOnCommand(tv);
        Command tvOff = new TelevisionOffCommand(tv);


        RemoteControl remote = new RemoteControl();


        remote.setCommands(lightOn, lightOff);
        System.out.println("Жарықты басқару:");
        remote.pressOnButton();
        remote.pressOffButton();
        remote.pressUndoButton();


        remote.setCommands(tvOn, tvOff);
        System.out.println("\nТеледидарды басқару:");
        remote.pressOnButton();
        remote.pressOffButton();
    }
}

