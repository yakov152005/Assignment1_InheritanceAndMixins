package QueastionTwo.devices;

import QueastionTwo.traits.KitchenDevice;
import QueastionTwo.traits.TemperatureControl;

public class Oven extends ElectronicDevice implements KitchenDevice, TemperatureControl {
    @Override
    public String getName() {
        return "Oven";
    }

    public void operateOven() {
        System.out.println(getName());
        switchOn();
        controlTemperature();
    }
}
