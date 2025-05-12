package QueastionTwo.traits;

public interface Display {
    default void changeResolution() {
        System.out.println("Change Resolution");
    }
}
