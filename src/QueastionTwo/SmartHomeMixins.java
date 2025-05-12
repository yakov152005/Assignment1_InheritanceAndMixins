package QueastionTwo;

import QueastionTwo.devices.*;
import QueastionTwo.remote.SmartRemote;

import java.util.*;


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
