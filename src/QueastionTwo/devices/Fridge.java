package QueastionTwo.devices;

import QueastionTwo.traits.KitchenDevice;
import QueastionTwo.traits.TemperatureControl;

public class Fridge extends ElectronicDevice implements KitchenDevice, TemperatureControl {
    @Override
    public String getName() {
        return "Fridge";
    }

    public void operateFridge() {
        System.out.println(getName());
        switchOn();
        controlTemperature();
    }
}
