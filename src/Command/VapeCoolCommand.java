package Command;

public class VapeCoolCommand implements Command {

    Vape vape;

    public VapeCoolCommand(Vape vape){
        this.vape = vape;
    }

    @Override
    public void undo() {
        vape.turnHeatUp();
    }

    @Override
    public void execute() {
        vape.turnHeatDown();
    }
}
