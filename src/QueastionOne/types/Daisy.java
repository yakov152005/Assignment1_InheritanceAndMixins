package QueastionOne.types;

import QueastionOne.entities.Flower;
import QueastionOne.traits.IsYellow;

public class Daisy extends Flower implements IsYellow {
    public String getName() {
        return "מרגנית";
    }
}
