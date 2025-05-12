package QueastionTwo.traits;

public interface KitchenDevice {
    default void kitchenOn() {
        System.out.println("Kitchen Device On");
    }
}
