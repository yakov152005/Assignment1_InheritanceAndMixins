package QueastionTwo.devices;

import QueastionTwo.traits.Audio;
import QueastionTwo.traits.HomeDevice;

public class Radio extends FrequencyDevice implements HomeDevice, Audio {
    @Override
    public String getName() {
        return "Radio";
    }

    public void operateRadio() {
        System.out.println(getName());
        switchOn();
        channelRunning();
        controlVolume();
    }
}
