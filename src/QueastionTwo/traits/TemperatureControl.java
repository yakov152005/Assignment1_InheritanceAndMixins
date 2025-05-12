package QueastionTwo.traits;

public interface TemperatureControl {
    default void controlTemperature() {
        System.out.println("Control Temperature");
    }
}
