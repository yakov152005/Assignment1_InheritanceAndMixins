package QueastionTwo;

import java.util.*;

abstract class EntityName {
    public abstract String getName();
}

abstract class ElectronicDevice extends EntityName {
    void switchOn() {
        System.out.println("Switch On");
    }
}

abstract class FrequencyDevice extends ElectronicDevice {
    void channelRunning() {
        System.out.println("Channel Running");
    }
}

abstract class MechanicalDevice {
    void mechanicalInput() {
        System.out.println("Mechanical Input");
    }
}

interface audio {
    default void controlVolume() {
        System.out.println("Control Volume");
    }
}

interface display {
    default void changeResolution() {
        System.out.println("Change Resolution");
    }
}

interface speed {
    default void controlSpeed() {
        System.out.println("Control Speed");
    }
}

interface TemperatureControl {
    default void controlTemperature() {
        System.out.println("Control Temperature");
    }
}

class Television extends FrequencyDevice implements LivingRoomDevice,audio, display {
    @Override
    public String getName() {
        return "Television";
    }

    void operateTelevision() {
        System.out.println(getName());
        switchOn();
        channelRunning();
        controlVolume();
        changeResolution();
    }
}

class Radio extends FrequencyDevice implements HomeDevice, audio {
    @Override
    public String getName() {
        return "Radio";
    }

    void operateRadio() {
        System.out.println(getName());
        switchOn();
        channelRunning();
        controlVolume();
    }
}

class Speaker extends ElectronicDevice implements HomeDevice, audio, display {
    @Override
    public String getName() {
        return "Speaker";
    }

    void operateSpeaker() {
        System.out.println(getName());
        switchOn();
        controlVolume();
    }
}

class ElectricMotor extends FrequencyDevice implements HomeDevice, speed {
    @Override
    public String getName() {
        return "Electric Motor";
    }

    void operateMotor() {
        System.out.println(getName());
        switchOn();
        controlSpeed();
    }
}

class MechanicalMotor extends MechanicalDevice implements HomeDevice, speed {
    String getName() {
        return "Mechanical Motor";
    }

    void operateMotor() {
        System.out.println(getName());
        mechanicalInput();
        controlSpeed();
    }
}

class Fridge extends ElectronicDevice implements KitchenDevice, TemperatureControl {
    @Override
    public String getName() {
        return "Fridge";
    }

    void operateFridge() {
        System.out.println(getName());
        switchOn();
        controlTemperature();
    }
}

class Oven extends ElectronicDevice implements KitchenDevice, TemperatureControl {
    @Override
    public String getName() {
        return "Oven";
    }

    void operateOven() {
        System.out.println(getName());
        switchOn();
        controlTemperature();
    }
}

interface KitchenDevice {
    default void kitchenOn() {
        System.out.println("Kitchen Device On");
    }
}

interface LivingRoomDevice {
    default void LivingRoomOn() {
        System.out.println("Living Room On");
    }
}

interface HomeDevice {
    default void HomeOn() {
        System.out.println("Home On");
    }
}


class SmartRemote {

    void operateAll(List<Object> devices) {
        System.out.println("--- Play all devices ---");
        int index = 1;

        for (Object device : devices) {
            System.out.print(index++ + ": ");
            if (device instanceof Television tv) tv.operateTelevision();
            else if (device instanceof Radio r) r.operateRadio();
            else if (device instanceof Speaker s) s.operateSpeaker();
            else if (device instanceof ElectricMotor e) e.operateMotor();
            else if (device instanceof MechanicalMotor m) m.operateMotor();
            else if (device instanceof Fridge f) f.operateFridge();
            else if (device instanceof Oven o) o.operateOven();
        }
    }

    void operateByCategory(List<Object> devices, String category) {
        System.out.println("--- Play by category: " + category.toUpperCase() + " ---");
        int index = 1;
        for (Object device : devices) {
            switch (category) {
                case "HomeDevice" -> {
                    if (device instanceof HomeDevice h) {
                        System.out.print(index++ + ": ");
                        System.out.println(device.getClass().getSimpleName());
                        h.HomeOn();
                    }
                }
                case "KitchenDevice" -> {
                    if (device instanceof KitchenDevice k) {
                        System.out.print(index++ + ": ");
                        System.out.println(device.getClass().getSimpleName());
                        k.kitchenOn();
                    }
                }
                case "LivingRoomDevice" -> {
                    if (device instanceof LivingRoomDevice l) {
                        System.out.print(index++ + ": ");
                        System.out.println(device.getClass().getSimpleName());
                        l.LivingRoomOn();
                    }
                }
                case "audio" -> {
                    if (device instanceof audio a) {
                        System.out.print(index++ + ": ");
                        System.out.println(device.getClass().getSimpleName());
                        a.controlVolume();
                    }
                }
                case "temperature" -> {
                    if (device instanceof TemperatureControl t) {
                        System.out.print(index++ + ": ");
                        System.out.println(device.getClass().getSimpleName());
                        t.controlTemperature();
                    }
                }
                case "speed" -> {
                    if (device instanceof speed s) {
                        System.out.print(index++ + ": ");
                        System.out.println(device.getClass().getSimpleName());
                        s.controlSpeed();
                    }
                }
            }
        }
    }
}

public class SmartHomeMixins {
    public static void main(String[] args) {
        List<Object> devices = Arrays.asList(
                new Television(),
                new Radio(),
                new Speaker(),
                new ElectricMotor(),
                new MechanicalMotor(),
                new Fridge(),
                new Oven()
        );

        SmartRemote remote = new SmartRemote();
        remote.operateAll(devices);
        System.out.println();
        remote.operateByCategory(devices, "HomeDevice");
        remote.operateByCategory(devices, "KitchenDevice");
        remote.operateByCategory(devices, "LivingRoomDevice");
        remote.operateByCategory(devices, "audio");
        remote.operateByCategory(devices, "temperature");
        remote.operateByCategory(devices, "speed");
    }
}
