package QueastionOne.types;

import QueastionOne.entities.Tree;
import QueastionOne.traits.IsGreen;

public class Pine extends Tree implements IsGreen {
    public String getName() {
        return "אורן";
    }
}
