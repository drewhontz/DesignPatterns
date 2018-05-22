package Command;

public class Oven {

    private Boolean status = Boolean.FALSE;

    public Oven(){}

    public void turnOn(){
        this.status = Boolean.TRUE;
        System.out.println("Oven is on");
    }

    public void turnOff(){
        this.status = Boolean.FALSE;
        System.out.println("Oven is off");
    }
}
