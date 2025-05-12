package QueastionTwo.devices;

import QueastionTwo.traits.HomeDevice;
import QueastionTwo.traits.Speed;

public class MechanicalMotor extends MechanicalDevice implements HomeDevice, Speed {
    String getName() {
        return "Mechanical Motor";
    }

    public void operateMotor() {
        System.out.println(getName());
        mechanicalInput();
        controlSpeed();
    }
}
