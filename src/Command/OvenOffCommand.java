package Command;

public class OvenOffCommand implements Command {

    private Oven oven;

    public OvenOffCommand(Oven oven){
        this.oven = oven;
    }
    @Override
    public void execute() {
        oven.turnOff();
    }

    @Override
    public void undo() {
        oven.turnOn();
    }
}
