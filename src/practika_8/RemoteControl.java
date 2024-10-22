package practika_8;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastCommand;

    public RemoteControl(int slots) {
        onCommands = new Command[slots];
        offCommands = new Command[slots];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            lastCommand = onCommands[slot];
        } else {
            System.out.println("Команда не назначена.");
        }
    }

    public void offButtonPressed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
            lastCommand = offCommands[slot];
        } else {
            System.out.println("Команда не назначена.");
        }
    }

    public void undoButtonPressed() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("Нет команды для отмены.");
        }
    }
}

