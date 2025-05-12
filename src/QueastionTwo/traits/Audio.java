package QueastionTwo.traits;

public interface Audio {
    default void controlVolume() {
        System.out.println("Control Volume");
    }
}
