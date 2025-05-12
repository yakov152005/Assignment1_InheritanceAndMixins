package QueastionOne.types;

import QueastionOne.entities.Bird;
import QueastionOne.traits.CanSing;
import QueastionOne.traits.IsYellow;

public class Canary extends Bird implements CanSing, IsYellow {
    public String getName() {
        return "קנרית";
    }
}
