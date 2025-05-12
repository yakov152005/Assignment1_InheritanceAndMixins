package QueastionTwo.devices;

import QueastionTwo.traits.Audio;
import QueastionTwo.traits.Display;
import QueastionTwo.traits.HomeDevice;

public class Speaker extends ElectronicDevice implements HomeDevice, Audio, Display {
    @Override
    public String getName() {
        return "Speaker";
    }

    public void operateSpeaker() {
        System.out.println(getName());
        switchOn();
        controlVolume();
    }
}
