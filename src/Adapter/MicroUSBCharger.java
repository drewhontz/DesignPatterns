package Adapter;

public class MicroUSBCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("Micro USB is charging at a steady pace");
    }
}
