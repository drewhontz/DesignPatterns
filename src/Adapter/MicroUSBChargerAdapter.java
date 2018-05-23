package Adapter;

public class MicroUSBChargerAdapter implements Charger {

    private MicroUSBCharger adaptee;

    public MicroUSBChargerAdapter (MicroUSBCharger charger) {
        adaptee = charger;
    }

    @Override
    public void charge() {
        adaptee.charge();
    }
}
