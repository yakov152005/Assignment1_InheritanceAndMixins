package QueastionOne.types;

import QueastionOne.entities.Fish;
import QueastionOne.traits.IsRed;

public class Salmon extends Fish implements IsRed {
    public String getName() {
        return "סלמון";
    }
}
