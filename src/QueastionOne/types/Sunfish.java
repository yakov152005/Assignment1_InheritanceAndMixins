package QueastionOne.types;

import QueastionOne.entities.Fish;
import QueastionOne.traits.IsYellow;

public class Sunfish extends Fish implements IsYellow {
    public String getName() {
        return "דג שמש";
    }
}
