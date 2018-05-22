package Command;

public class OvenOnCommand implements Command {

    private Oven oven;

    public OvenOnCommand(Oven oven){
        this.oven = oven;
    }
    @Override
    public void execute() {
        oven.turnOn();
    }

    @Override
    public void undo() {
        oven.turnOff();
    }
}
