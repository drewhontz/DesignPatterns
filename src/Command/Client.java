package Command;

public class Client {

    public static void main(String[] args){
        // Create remote
        Remote remote = new Remote();

        // Create Vape object & Commands
        Vape vape = new Vape();
        VapePowerToggleCommand vpc = new VapePowerToggleCommand(vape);
        VapeHeatCommand vhc = new VapeHeatCommand(vape);
        VapeCoolCommand vcc = new VapeCoolCommand(vape);

        // Create Over object
        Oven oven = new Oven();

        // Create macro command
        PrepareFoodandVapeCommand macro = new PrepareFoodandVapeCommand(oven, vape);

        // Set remote commands
        remote.setCommand(vpc);
        remote.setDialClockwise(vhc);
        remote.setDialCounterClockwise(vcc);
        remote.setMacro(macro);

        // Turn vape on, turn up heat, turn down heat, turn vape off
        // change heat w/ vape off
        remote.buttonPress();
        remote.dialClockwise();
        remote.dialClockwise();
        remote.unPressButton();
        remote.dialClockwise();
        remote.dialCounterClockwise();
        remote.buttonPress();
        remote.unPressButton();
        remote.dialClockwise();
        remote.dialCounterClockwise();
        remote.pressMacro();
    }
}
