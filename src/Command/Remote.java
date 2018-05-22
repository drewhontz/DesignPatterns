package Command;

public class Remote {

    private Command slot;
    private Command dialClockwise;
    private Command dialCounterClockwise;
    private Command lastCommand;

    public void setCommand(Command cmd){
        slot = cmd;
    }

    public void setDialClockwise(Command cmd){
        dialClockwise = cmd;
    }

    public void setDialCounterClockwise(Command cmd){
        dialCounterClockwise = cmd;
    }

    public void buttonPress(){
        lastCommand = slot;
        slot.execute();
    }

    public void dialClockwise(){
        lastCommand = dialClockwise;
        dialClockwise.execute();
    }

    public void dialCounterClockwise() {
        lastCommand = dialCounterClockwise;
        dialCounterClockwise.execute();
    }

    public void unPressButton(){
        lastCommand.undo();
    }
}