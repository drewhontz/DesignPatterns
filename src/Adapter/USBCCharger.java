package Adapter;

public class USBCCharger implements FastCharger {
    @Override
    public void charge() {
        System.out.println("USB C is charging at a steady pace");
    }

    @Override
    public void fastCharge() {
        System.out.println("USB C is charging at a rapid pace");
    }
}
