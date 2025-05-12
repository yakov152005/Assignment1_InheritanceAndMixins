package QueastionTwo.remote;

import QueastionTwo.devices.*;
import QueastionTwo.traits.*;

import java.util.List;

public class SmartRemote {

    public void operateAll(List<Object> devices) {
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

    public void operateByCategory(List<Object> devices, String category) {
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
                    if (device instanceof Audio a) {
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
                    if (device instanceof Speed s) {
                        System.out.print(index++ + ": ");
                        System.out.println(device.getClass().getSimpleName());
                        s.controlSpeed();
                    }
                }
            }
        }
    }
}
