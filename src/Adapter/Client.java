package Adapter;

public class Client {

        public static void main (String[] args) {
            USBCCharger cCharger = new USBCCharger();
            MicroUSBCharger mCharger = new MicroUSBCharger();

            USBCChargerAdapter cAdapter = new USBCChargerAdapter(cCharger);
            MicroUSBChargerAdapter mAdapter = new MicroUSBChargerAdapter((mCharger));

            Charger[] chargers = {cAdapter, mAdapter};

            for (Charger c : chargers) {
                c.charge();
            }

        }
}
