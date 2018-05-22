package Command;

public class VapeHeatCommand implements Command {

    Vape vape;

    public VapeHeatCommand(Vape vape){
        this.vape = vape;
    }

    @Override
    public void undo() {
        vape.turnHeatDown();
    }

    @Override
    public void execute() {
        vape.turnHeatUp();
    }
}
