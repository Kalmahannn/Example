package dom_8;

public class RemoteContro {
    private Command lastCommand;

    public void setCommand(Command command) {
        lastCommand = command;
        command.execute();
    }

    public void undoCommand() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("Нет команды для отмены.");
        }
    }
}

