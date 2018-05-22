package Command;

public class Vape {
    private Boolean status;
    private int heat = 0;
    private int MAX_HEAT = 10;

    public Vape(){
        status = Boolean.FALSE;
    }

    public void togglePower(){
        status = !status;
        if (status) System.out.println("Vape is on");
        else System.out.println("Vape is off");
    }

    public void turnHeatUp(){
        if (status) {
            if (heat == MAX_HEAT) {
                System.out.println("Vape already at maximum heat");
            } else {
                heat += 1;
                System.out.println("Vape heat at " + heat);
            }
        }
    }

    public void turnHeatDown(){
        if (status) {
            if (heat == 0) {
                System.out.println("Vape already at minimum heat");
            } else {
                heat -= 1;
                System.out.println("Vape heat at " + heat);
            }
        }
    }
}
