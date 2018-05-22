package Command;

public class VapePowerToggleCommand implements Command {

    Vape vape;

    @Override
    public void undo() {
        vape.togglePower();
    }

    public VapePowerToggleCommand(Vape vape){
        this.vape = vape;
    }

    @Override
    public void execute() {
        vape.togglePower();
    }
}
