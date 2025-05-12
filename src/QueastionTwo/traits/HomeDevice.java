package QueastionTwo.traits;

public interface HomeDevice {
    default void HomeOn() {
        System.out.println("Home On");
    }
}
