package QueastionTwo.devices;

import QueastionTwo.traits.*;

public class Television extends FrequencyDevice implements LivingRoomDevice, Audio, Display {
    @Override
    public String getName() {
        return "Television";
    }

    public void operateTelevision() {
        System.out.println(getName());
        switchOn();
        channelRunning();
        controlVolume();
        changeResolution();
    }
}
