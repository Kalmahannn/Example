package labka_7;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;

    public void setCommands(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOnButton() {
        if (onCommand != null) {
            onCommand.execute();
        } else {
            System.out.println("Қосу пәрмені жоқ.");
        }
    }

    public void pressOffButton() {
        if (offCommand != null) {
            offCommand.execute();
        } else {
            System.out.println("Өшіру пәрмені жоқ.");
        }
    }

    public void pressUndoButton() {
        if (onCommand != null) {
            onCommand.undo();
        } else {
            System.out.println("Бас тарту командасы жоқ.");
        }
    }
}
