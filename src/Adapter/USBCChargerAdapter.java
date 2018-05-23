package Adapter;

public class USBCChargerAdapter implements Charger {

    private USBCCharger adaptee;

    public USBCChargerAdapter(USBCCharger charger){
        adaptee = charger;
    }

    @Override
    public void charge() {
        adaptee.charge();
    }
}
