package QueastionOne.types;

import QueastionOne.entities.Flower;
import QueastionOne.traits.IsRed;

public class Rose extends Flower implements IsRed {
    public String getName() {
        return "ורד";
    }
}
