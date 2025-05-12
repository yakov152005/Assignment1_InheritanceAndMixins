package QueastionOne.types;

import QueastionOne.entities.Bird;
import QueastionOne.traits.IsRed;

public class Robin extends Bird implements IsRed {
    public String getName() {
        return "אדום החזה";
    }
}
