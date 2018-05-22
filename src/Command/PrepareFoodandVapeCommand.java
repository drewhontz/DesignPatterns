package Command;

public class PrepareFoodandVapeCommand implements Command {

    Oven oven;
    Vape vape;
    Command[] commands = new Command[2];

    public PrepareFoodandVapeCommand(Oven oven, Vape vape){
        this.oven = oven;
        this.vape = vape;

        commands[0] = new OvenOnCommand(oven);
        commands[1] = new VapePowerToggleCommand(vape);
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
